import java.util.*;

public class AsteriskPrinterMain {
    public static void main(String[] args) {
        Scanner keyType = new Scanner(System.in);
        askAndDraw(keyType);
    }

    static void askAndDraw(Scanner keyType) {
        while (true) {
            System.out.println("Please type in the number of the option you would like to choose.");
            AsteriskDrawer.displayOptions();
            switch (NumberInput.noNegIntInput(keyType)) {
                case 1: //Box
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawBox(NumberInput.noNegIntInput(keyType));
                    break;
                case 2: //Left-aligned-triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawLeftAlignedTriangle(NumberInput.noNegIntInput(keyType));
                    break;
                case 3: //Right-center-triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawRightAlignedTriangle(NumberInput.noNegIntInput(keyType));
                    break;
                case 4: //Center triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawCenterAlignedTriangle(NumberInput.noNegIntInput(keyType));
                    break;
                case 5: //Exit
                    return;
                default:
                    System.out.println("Not a valid option.");
                    break;
            }
            System.out.println();
        }
    }
}
