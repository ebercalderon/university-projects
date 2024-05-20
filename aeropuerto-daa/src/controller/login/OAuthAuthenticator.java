package controller.login;

import animatefx.animation.FadeIn;
import controller.AirportController;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class OAuthAuthenticator {
    private final String GOOGLE_APISCOPE = "https://www.googleapis.com/auth/userinfo.profile";
    private JSONObject accessedJsonData;
    private boolean gotData = false;
    private String accessToken;
    private String accessCode;
    private String clientID;
    private String redirectUri;
    private String clientSecret;
    private String[] userInfo;

    /**
     * El método constructor de un objeto OAuth
     */
    public OAuthAuthenticator(String clientID, String redirectUri, String clientSecret) {
        this.clientID = clientID;
        this.redirectUri = redirectUri;
        this.clientSecret = clientSecret;
        userInfo = new String[4];
    }

    /**
     * Obtiene la Url de la web
     * 
     * @return Url actual de la web.
     */
    private String getWebUrl() {
        return "https://accounts.google.com/o/oauth2/v2/auth?scope=" + GOOGLE_APISCOPE
                + "&access_type=offline&redirect_uri=" + getRedirectUri() + "&response_type=code&client_id="
                + getClientID();
    }

    /**
     * Obtiene la url del token de la API.
     * 
     * @return url renderizada concatenada con nuestro accessToken.
     */
    private String getApiTokenUrl() {
        return "https://www.googleapis.com/oauth2/v2/userinfo?access_token=" + getAccessToken();
    }

    /**
     * Obtiene la url de acceso a la API.
     * 
     * @return String esperada.
     */
    private String getApiAccessUrl() {
        return "https://www.googleapis.com/oauth2/v4/token";
    }

    /**
     * Obtiene el ID de cliente propio de nuestra aplicación de Google.
     * 
     * @return ID cliente
     */
    private String getClientID() {
        return clientID;
    }

    /**
     * Obtiene el secreto de cliente propio de nuestra aplicación de Google.
     * 
     * @return Cliente secreto
     */
    private String getClientSecret() {
        return clientSecret;
    }

    /**
     * Obtiene el URI de redirección.
     * 
     * @return redirigir a Uri
     */
    private String getRedirectUri() {
        return redirectUri;
    }

    /**
     * Obtiene los parámetros de la API.
     * 
     * @return Cadena que se utilizará posteriormente
     */
    private String getApiAccessParams() {
        return "client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri() + "&client_secret="
                + getClientSecret() + "&grant_type=authorization_code&code=" + getAccessCode();
    }

    /**
     * Obtiene el token de acceso.
     * 
     * @return Acceso al token
     */
    private String getAccessToken() {
        return accessToken;
    }

    /**
     * Obtiene el código de acceso.
     * 
     * @return accessCode
     */
    private String getAccessCode() {
        return accessCode;
    }

    /**
     * Obtiene un objeto json propio de nuestro atributo.
     * 
     * @return accessedJsonData
     */
    public JSONObject getJsonData() {
        if (gotData) {
            return accessedJsonData;
        } else {
            return null;

        }
    }

    /**
     * Este método satisface el requisito de autenticación de Google.
     * Post: Redirigirá a su cliente a la ruta del tablero.
     * 
     * @param lController != null
     * @param aController != null
     */
    public void startLogin(WebView root, Pane gPane, Pane gInfo, AirportController aController,
            LoginController lController) {
        WebEngine engine = root.getEngine();
        engine.load(getWebUrl());
        engine.setOnStatusChanged(new EventHandler<WebEvent<String>>() {
            public void handle(WebEvent<String> event) {
                WebEngine we = (WebEngine) event.getSource();
                String location = we.getLocation();
                if (location.contains("code") && location.startsWith(getRedirectUri())) {
                    gotData = true;
                    accessCode = location.substring(location.indexOf("code=") + 5);
                    accessToken = doGetAccessTokenRequest(accessCode);
                    String returnedJson = doGetAccountInfo(accessToken);
                    accessedJsonData = new JSONObject(returnedJson);
                    try {
                        lController.authGoogle(userInfo);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        new FadeIn(gPane).play();
        gPane.toFront();
        new FadeIn(gInfo).play();
        gInfo.toFront();
    }

    /**
     * Ayúdanos a conseguir la información de nuestros usuarios.
     * 
     * @param accessToken de otro método.
     * @return información del usuario en google
     */
    private String doGetAccountInfo(String accessToken) {
        try {
            HttpURLConnection connection2 = null;
            URL url2 = new URL(getApiTokenUrl());
            connection2 = (HttpURLConnection) url2.openConnection();
            connection2.setRequestProperty("User-Agent", "Mozilla/5.0");

            connection2.setDoInput(true);
            connection2.setDoOutput(true);

            int reponseCode2 = connection2.getResponseCode();

            if (reponseCode2 == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                String inputLine2;
                StringBuffer response2 = new StringBuffer();
                int i = 0;
                while ((inputLine2 = in2.readLine()) != null) {
                    if (inputLine2.length() > 8) {
                        String[] render = inputLine2.split(" ");
                        if (render[2].equals("\"id\"" + ":") || render[2].equals("\"given_name\"" + ":")
                                || render[2].equals("\"family_name\"" + ":") || render[2].equals("\"picture\"" + ":")) {
                            String redux = render[3].replaceAll("\"", "");
                            userInfo[i] = redux.substring(0, redux.length() - 1);
                            i++;
                        }
                    }
                    response2.append(inputLine2);

                }
                in2.close();
                connection2.disconnect();
                return response2.toString();
            } else {
                System.out.println("¡Error al recuperar los datos de la api!: " + reponseCode2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Ayuda a conseguir nuestro token de acceso.
     * 
     * @param code obtenido en la ruta de nuestro sitio web.
     * @return token de acceso para nuestros datos de usuario json.
     */
    private String doGetAccessTokenRequest(String code) {
        try {
            URL url = new URL(getApiAccessUrl());
            String urlParams = getApiAccessParams();

            byte[] postData = urlParams.getBytes(StandardCharsets.UTF_8);
            int postDataLength = postData.length;

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Content-Length", "" + postDataLength);
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.write(postData);
            wr.flush();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.err.println("¡Error al obtener el token de acceso para OAuth Login!");
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            connection.disconnect();
            String fullResponse = response.toString();
            JSONObject json = new JSONObject(fullResponse);
            String accessToken = json.getString("access_token");
            return accessToken;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
