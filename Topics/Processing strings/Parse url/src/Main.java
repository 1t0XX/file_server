import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();

        String params = url.substring(30, url.length());
        String[] paramsArray = params.split("&");

        String notFound = "not found";

        String pass = "";
        String port = "";
        String cookie = "";
        String host = "";
        String name = "";

        String password = "";

        for (String s : paramsArray) {
            if (s.contains("pass=")) {
                pass += s.substring(5);
            }

            if (s.contains("port=")) {
                port += s.substring(5);
            }

            if (s.contains("name=")) {
                name += s.substring(5);
            }

            if (s.contains("cookie=")) {
                cookie += s.substring(7);
            }

            if (s.contains("host=")) {
                host += s.substring(5);
            }

        }

        if (!params.contains("pass=") && params.contains("name=")) {
            urlMetod(notFound, port, cookie, host, name);
        } else if (!params.contains("pass=")) {
            System.out.println("port : " + port);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
        } else if (params.contains("pass=") && params.contains("name=")) {
            urlMetod(notFound, port, cookie, host, name);
            if (pass.equals("")) {
                pass += notFound;
            }
            System.out.println("pass : " + pass);
        } else {
            System.out.println("pass : " + pass);
            if (pass.equals("")) {
                pass += notFound;
            }
            System.out.println("port : " + port);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
        }

        for (int j = 0; j < paramsArray.length; j++) {
            if (paramsArray[j].contains("pass=") && !pass.contains(notFound)) {
                password += pass;
                System.out.println("password : " + password);
                break;
            }
        }


    }

    private static void urlMetod(String notFound, String port, String cookie, String host, String name) {
        System.out.println("port : " + port);
        System.out.println("name : " + name);
        if (cookie.equals("")) {
            cookie += notFound;
        }
        System.out.println("cookie : " + cookie);
        System.out.println("host : " + host);
    }
}
