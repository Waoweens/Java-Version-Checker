package online.meowcorp.java.versionchecker;

public class Main {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
        InfoBox.infoBox("Java Version: " + javaVersion, "Java Version Checker");
    }
}
