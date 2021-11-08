import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */

/*
1. get input - number of widgets ( pop up boxes )
2. calculate num of days
    - widgets 
3. calculate cost of production
4. calculate cost of widgets
4. calculate profit
5. add to panel - num of widgets, num of days, cost of production, cost of widgets
 */


    static double numOfWidgets = getInput("How many widgets were made?");
    public static void main(String[] args) {
        double numOfWidgets = getInput("How many widgets were made?");
    }

            public static double getInput(String prompt) {

                return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

            private static class Days implements ActionListener {

                public void actionPerformed(ActionEvent actionEvent) {

                    double hours = numOfWidgets / 10;
                    double days = hours / 16;
                    DecimalFormat round = new DecimalFormat("0.00");

        }
    }

            private static class ProductionCost implements ActionListener {

                public void actionPerformed(ActionEvent actionEvent) {

                    
                    double costOfProduction(double days) =

                }
            }
}