package builderdesign.simpleBuilder;


import java.util.HashMap;
import java.util.Map;

public class HttpRequest{
    private String url;
    private String method;
    Map<String,String>headers;
    Map<String,String> queryParams;
    String body;
    int timeout;

    HttpRequest() {
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        body = "";
    }

   // public class HttpRequestBuilder{};

    void execute(){
        System.out.println("Executing request: " + method + " " + url);

        if(!queryParams.isEmpty()){
            System.out.println("QueryParams: ");
            for(Map.Entry<String,String> entry : queryParams.entrySet()){
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
        System.out.println("Headers: ");
        for(Map.Entry<String,String> entry : headers.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        if(!body.isEmpty()){
            System.out.println("Body: " + body);
        }
        System.out.println("Timeout: " + timeout);
        System.out.println("Request executed successfully");
    }

    public static class HttpRequestBuilder{
        private HttpRequest request;

        public HttpRequestBuilder(){
            request = new HttpRequest();
        }

        //Method Chaining
        public HttpRequestBuilder withUrl(String url){
            request.url = url;
            return this;
        }

        public HttpRequestBuilder withMethod(String method){
            request.method = method;
            return this;
        }

        public HttpRequestBuilder withHeader(String key, String value){
            request.headers.put(key, value);
            return this;
        }
        public HttpRequestBuilder withQueryParam(String key, String value){
            request.queryParams.put(key, value);
            return this;
        }

        public HttpRequestBuilder withBody(String body){
            request.body = body;
            return this;
        }

        public HttpRequestBuilder withTimeout(int timeout){
            request.timeout = timeout;
            return this;
        }

        public HttpRequest build(){
            if(request.url==null||request.url.isEmpty()){
                throw new RuntimeException("url is empty");
            }
            return request;
        }
    }
}

