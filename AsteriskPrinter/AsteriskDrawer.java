public class AsteriskDrawer {

    static void displayOptions() {
        System.out.println("1) Box");
        System.out.println("2) Left-Aligned Triangle");
        System.out.println("3) Right-Aligned Triangle");
        System.out.println("4) Centered Triangle");
        System.out.println("5) Exit");
    }

    static void askForNumRows() {
        System.out.println();
        System.out.println("Input the number of rows you want.");
    }

    //draws lines with the same number of asterisks as the number of columns.
    static void drawBox(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j < numRows; j++) {
                System.out.print("*");
            }
        }
    }

    //draws LeftAlignedTriangle by drawing 1 asterisk then increasing by 1 for each row.
    static void drawLeftAlignedTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    //draws blank spaces and then draws the correct number of asterisks
    static void drawRightAlignedTriangle(int numRows) {
        for (int i = numRows; i > 0; i--) {
            System.out.println();
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        }
    }

    //draws blank spaces and then draws the correct number of asterisks
    static void drawCenterAlignedTriangle(int numRows) {
        int maxRowLength = numRows * 2 - 1;
        for (int i = 1; i <= maxRowLength; i += 2) {
            System.out.println();
            for (int j = 0; j < (maxRowLength - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        }
    }
}
