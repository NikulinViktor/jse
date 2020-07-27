package nlmk.nikulinvs.tm;

import static nlmk.nikulinvs.tm.constant.TerminalConst.*;

/**
 * Тестовое приложение
 */

public class App {

    public static void main(final String[] args) {
        displayWelcom();
        run(args);

    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        switch (param) {
            case CMD_VERSION: displayVersion();
            case CMD_ABOUT: displayAbout();
            case CMD_HELP: displayHelp();
            default: displayError();
        }

    }

    private static void displayError() {
        System.out.println("Error! Unknown programm arguments ...");
        System.exit(-1);
    }

    private static void displayWelcom() {

        System.out.println("**Welcom to Task Manager**");
        }

    private static void displayHelp() {
        System.out.println("version - Display programm version");
        System.out.println("about - Display developer info");
        System.out.println("help - Display list of terminal commands");
        System.exit(0);
        }

    private static void displayVersion() {
        System.out.println("1.0.0");
        System.exit(0);
        }

    private static void displayAbout() {
        System.out.println("Nikulin Viktor");
        System.out.println("nikulin_vs@nlmk.com");
        System.exit(0);
        }

}
