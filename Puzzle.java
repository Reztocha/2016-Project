/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.*;

/**
 *
 * @author Catherine Denis and Kevin Castaneda
 */
public class Puzzle extends Application {
   
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button27;
    private Button button28;
    private Button button29;
    private Button button30;
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;
    private Button button37;
    private Button button38;
    private Button button39;
    private Button button40;
    private Button button41;
    private Button button42;
    private Button button43;
    private Button button44;
    private Button button45;
    private Button button46;
    private Button button47;
    private Button button48;
    private Button gameBoard[][]; 
    
    @Override
    public void start(Stage primaryStage) {
        //Initializing the 2d array and assigning all of the buttons to locations
        //within the array
        gameBoard = new Button[8][8];
        gameBoard[0][0] = button1;
        gameBoard[0][1] = button2;
        gameBoard[0][2] = button3;
        gameBoard[0][3] = button4;
        gameBoard[0][4] = button5;
        gameBoard[0][5] = button6;
        gameBoard[0][6] = button7;
        gameBoard[0][7] = button8;
        gameBoard[1][0] = button9;
        gameBoard[1][1] = button10;
        gameBoard[1][2] = button11;
        gameBoard[1][3] = button12;
        gameBoard[1][4] = button13;
        gameBoard[1][5] = button14;
        gameBoard[1][6] = button15;
        gameBoard[1][7] = button16;
        gameBoard[2][0] = button17;
        gameBoard[2][1] = button18;
        gameBoard[2][2] = button19;
        gameBoard[2][3] = button20;
        gameBoard[2][4] = button21;
        gameBoard[2][5] = button22;
        gameBoard[2][6] = button23;
        gameBoard[2][7] = button24;
        gameBoard[3][0] = button25;
        gameBoard[3][1] = button26;
        gameBoard[3][2] = button27;
        gameBoard[3][3] = button28;
        gameBoard[3][4] = button29;
        gameBoard[3][5] = button30;
        gameBoard[3][6] = button31;
        gameBoard[3][7] = button32;
        gameBoard[4][0] = button33;
        gameBoard[4][1] = button34;
        gameBoard[4][2] = button35;
        gameBoard[4][3] = button36;
        gameBoard[5][0] = button37;
        gameBoard[5][1] = button38;
        gameBoard[5][2] = button39;
        gameBoard[5][3] = button40;
        gameBoard[6][0] = button41;
        gameBoard[6][1] = button42;
        gameBoard[6][2] = button43;
        gameBoard[6][3] = button44;
        gameBoard[7][0] = button45;
        gameBoard[7][1] = button46;
        gameBoard[7][2] = button47;
        gameBoard[7][3] = button48;
        
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);
        
        primaryStage.setScene(scene);
        
        //Story Area
        Rectangle storyBox = new Rectangle(440, 40, 300, 250);
        storyBox.setFill(Color.WHITE);
        storyBox.setStroke(Color.BLACK);
        storyBox.setStrokeWidth(2);
        root.getChildren().add(storyBox);
        
        //Story Label
        Label story = new Label();
        story.setText("Backstory and Goal");
        story.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        story.setTranslateX(450);
        story.setTranslateY(50);
        root.getChildren().add(story);
        
        //Story Text
        Text storyText = new Text();
        storyText.setText("The North American Crossword Championships were held this week in St. Augustine, Florida. The top-finishing contestants all performed admirably, but incredibly, each of them managed to get just one answer incorrect (i.e. \\\"2 Down\\\" or \\\"30 Across\\\"). Using only the clues below, match each contestant to his or her final placement and hometown, and determine the one clue each of them ended up answering incorrectly.");
        storyText.setWrappingWidth(280);
        storyText.setTranslateX(450);
        storyText.setTranslateY(90);
        root.getChildren().add(storyText);
        
        //Clue Area
        Rectangle clueBox = new Rectangle(440, 240, 300, 250);
        clueBox.setFill(Color.WHITE);
        clueBox.setStroke(Color.BLACK);
        clueBox.setStrokeWidth(2);
        root.getChildren().add(clueBox);
        
        //Clue Label
        Label clues = new Label();
        clues.setText("Clues");
        clues.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        clues.setTranslateX(450);
        clues.setTranslateY(250);
        root.getChildren().add(clues);
        
        //Clues
        Text clue1 = new Text();
        clue1.setText("1. The solver who finished second was from Miles.");
        clue1.setTranslateX(460);
        clue1.setTranslateY(300);
        root.getChildren().add(clue1);
        
        Text clue2 = new Text();
        clue2.setText("2.  Eva was either the contestant who finished third or the solver from Miles.");
        clue2.setWrappingWidth(280);
        clue2.setTranslateX(460);
        clue2.setTranslateY(330);
        root.getChildren().add(clue2);
        
        Text clue3 = new Text();
        clue3.setText("3.  The four people were the contestant from Needles, the person who finished fourth, Melinda and Grace.");
        clue3.setWrappingWidth(280);
        clue3.setTranslateX(460);
        clue3.setTranslateY(375);
        root.getChildren().add(clue3);
        
        Text clue4 = new Text();
        clue4.setText("4. Melinda was from Canoga Park.");
        clue4.setTranslateX(460);
        clue4.setTranslateY(440);
        root.getChildren().add(clue4);
        
        //Category Labels - Left Column
        Label label1 = new Label();
        label1.setText("placements");
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label1.setRotate(-90);
        label1.setTranslateX(-10);
        label1.setTranslateY(180);
        
        Label label2 = new Label();
        label2.setText("towns");
        label2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label2.setRotate(-90);
        label2.setTranslateX(10);
        label2.setTranslateY(280);
        
        //Category labels - Top Row
        Label label3 = new Label();
        label3.setText("contestants");
        label3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label3.setTranslateX(160);
        label3.setTranslateY(10);
        
        Label label4 = new Label();
        label4.setText("towns");
        label4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        label4.setTranslateX(280);
        label4.setTranslateY(10);
        
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(label3);
        root.getChildren().add(label4);
        
        //Option Areas
        Group rectangles = new Group();
        for(int i = 0; i < 8; i++) {
            Rectangle rect = new Rectangle(45, (135 + i*25), 100, 25);
            rect.setFill(Color.WHITE);
            rect.setStrokeType(StrokeType.OUTSIDE);
            rect.setStroke(Color.web("black", 1));
            rect.setStrokeWidth(1);
            rectangles.getChildren().add(rect);
        }
        for(int i = 0; i < 8; i++) {
            Rectangle rect1 = new Rectangle((146 + i*25), 34, 25, 100);
            rect1.setFill(Color.WHITE);
            rect1.setStrokeType(StrokeType.OUTSIDE);
            rect1.setStroke(Color.web("black", 1));
            rect1.setStrokeWidth(1);
            rectangles.getChildren().add(rect1);
        }
        root.getChildren().add(rectangles);
        
        //Option Labels - Top Row
        Label day1 = new Label();
        day1.setText("Eva");
        day1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        day1.setRotate(-90);
        day1.setTranslateX(145);
        day1.setTranslateY(75);
        root.getChildren().add(day1);
        
        Label day2 = new Label();
        day2.setText("Grace");
        day2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        day2.setRotate(-90);
        day2.setTranslateX(160);
        day2.setTranslateY(75);
        root.getChildren().add(day2);
        
        Label day3 = new Label();
        day3.setText("Ian");
        day3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        day3.setRotate(-90);
        day3.setTranslateX(195);
        day3.setTranslateY(75);
        root.getChildren().add(day3);
        
        Label day4 = new Label();
        day4.setText("Melinda");
        day4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        day4.setRotate(-90);
        day4.setTranslateX(205);
        day4.setTranslateY(75);
        root.getChildren().add(day4);
        
        Label item1 = new Label();
        item1.setText("Canoga Park");
        item1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        item1.setRotate(-90);
        item1.setTranslateX(215);
        item1.setTranslateY(75);
        root.getChildren().add(item1);
        
        Label item2 = new Label();
        item2.setText("Fowler");
        item2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        item2.setRotate(-90);
        item2.setTranslateX(260);
        item2.setTranslateY(75);
        root.getChildren().add(item2);
        
        Label item3 = new Label();
        item3.setText("Miles");
        item3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        item3.setRotate(-90);
        item3.setTranslateX(290);
        item3.setTranslateY(75);
        root.getChildren().add(item3);
        
        Label item4 = new Label();
        item4.setText("Needles");
        item4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        item4.setRotate(-90);
        item4.setTranslateX(305);
        item4.setTranslateY(75);
        root.getChildren().add(item4);
        
        //Option Labels - Left Column
        Label store1 = new Label();
        store1.setText("first");
        store1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        store1.setTranslateX(55);
        store1.setTranslateY(140);
        root.getChildren().add(store1);
        
        Label store2 = new Label();
        store2.setText("second");
        store2.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        store2.setTranslateX(55);
        store2.setTranslateY(165);
        root.getChildren().add(store2);
        
        Label store3 = new Label();
        store3.setText("third");
        store3.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        store3.setTranslateX(55);
        store3.setTranslateY(190);
        root.getChildren().add(store3);
        
        Label store4 = new Label();
        store4.setText("fourth");
        store4.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        store4.setTranslateX(55);
        store4.setTranslateY(215);
        root.getChildren().add(store4);
        
        Label apple = new Label();
        apple.setText("Canoga Park");
        apple.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        apple.setTranslateX(55);
        apple.setTranslateY(240);
        root.getChildren().add(apple);
        
        Label tbrush = new Label();
        tbrush.setText("Fowler");
        tbrush.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        tbrush.setTranslateX(55);
        tbrush.setTranslateY(265);
        root.getChildren().add(tbrush);
        
        Label candy = new Label();
        candy.setText("Miles");
        candy.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        candy.setTranslateX(55);
        candy.setTranslateY(290);
        root.getChildren().add(candy);
        
        Label bowl = new Label();
        bowl.setText("Needles");
        bowl.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
        bowl.setTranslateX(55);
        bowl.setTranslateY(315);
        root.getChildren().add(bowl);
        
        //Cell Area
        Rectangle sq = new Rectangle(146, 135, 100, 100);
        sq.setFill(Color.WHITE);
        Rectangle sq2 = new Rectangle(246, 135, 100, 100);
        sq2.setFill(Color.WHITE);
        sq2.setStroke(Color.web("black", 1));
        sq2.setStrokeWidth(1);
        Rectangle sq3 = new Rectangle(145, 235, 101, 101);
        sq3.setFill(Color.WHITE);
        sq3.setStroke(Color.web("black", 1));
        sq3.setStrokeWidth(1);
        
        root.getChildren().add(sq);
        root.getChildren().add(sq2);
        root.getChildren().add(sq3); 
        
        //Buttons
        Button btn = new Button();
        btn.setText("Hints");
        btn.setTranslateX(90);
        btn.setTranslateY(390);
        root.getChildren().add(btn);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(event.getSource() == btn){
                    Rectangle hints = new Rectangle(30, 430, 400, 150);
                    hints.setFill(Color.WHITE);
                    hints.setStroke(Color.BLACK);
                    Text hint = new Text();
                    hint.setText("Clue 1: Second and Miles are explicitly true.\n" +

"Clue 2: Canoga Park and Melinda are explicitly true.\n"
+
"Clue 3: If Needles and fourth are separate entities, then Needles does\n" +
"not equal fourth.\n" +
"Clue 4: If Needles and Grace are separate entities, then Needles does\n" +
"not equal Grace.\n" +
"Clue 5: If fourth and Melinda are separate entities, then fourth does\n" +
"not equal Melinda.");
                    hint.setTranslateX(31);
                    hint.setTranslateY(461);
                    hint.setWrappingWidth(400);
                    root.getChildren().add(hints);
                    root.getChildren().add(hint);
                }
            }
        });
        
        //Adding buttons
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 8; j++) {
                gameBoard[i][j] = new Button();
                gameBoard[i][j].setMinSize(25, 25);
                gameBoard[i][j].setTranslateX(145 + (j * 25));
                gameBoard[i][j].setTranslateY(135 + (i * 25));
                root.getChildren().add(gameBoard[i][j]);
            }
        }
        for(int i = 4; i < 8; i++) {
            for(int j = 0; j < 4; j++) {
                gameBoard[i][j] = new Button();
                gameBoard[i][j].setMinSize(25, 25);
                gameBoard[i][j].setTranslateX(145 + (j * 25));
                gameBoard[i][j].setTranslateY(135 + (i * 25));
                root.getChildren().add(gameBoard[i][j]);
            }
        }
        //
        gameBoard[0][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[0][0] && gameBoard[0][0].getText() == "")
                    {
                        gameBoard[0][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][0] && gameBoard[0][0].getText() == "o")
                    {
                        gameBoard[0][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][0] && gameBoard[0][0].getText() == "x"){
                        gameBoard[0][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[0][1] && gameBoard[0][1].getText() == "")
                    {
                        gameBoard[0][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][1] && gameBoard[0][1].getText() == "o")
                    {
                        gameBoard[0][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][1] && gameBoard[0][1].getText() == "x"){
                        gameBoard[0][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][2] && gameBoard[0][2].getText() == "")
                    {
                        gameBoard[0][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][2] && gameBoard[0][2].getText() == "o")
                    {
                        gameBoard[0][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][2] && gameBoard[0][2].getText() == "x"){
                        gameBoard[0][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][3] && gameBoard[0][3].getText() == "")
                    {
                        gameBoard[0][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][3] && gameBoard[0][3].getText() == "o")
                    {
                        gameBoard[0][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][3] && gameBoard[0][3].getText() == "x"){
                        gameBoard[0][3].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][4] && gameBoard[0][4].getText() == "")
                    {
                        gameBoard[0][4].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][4] && gameBoard[0][4].getText() == "o")
                    {
                        gameBoard[0][4].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][4] && gameBoard[0][4].getText() == "x"){
                        gameBoard[0][4].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][5].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][5] && gameBoard[0][5].getText() == "")
                    {
                        gameBoard[0][5].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][5] && gameBoard[0][5].getText() == "o")
                    {
                        gameBoard[0][5].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][5] && gameBoard[0][5].getText() == "x"){
                        gameBoard[0][5].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][6].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][6] && gameBoard[0][6].getText() == "")
                    {
                        gameBoard[0][6].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][6] && gameBoard[0][6].getText() == "o")
                    {
                        gameBoard[0][6].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][6] && gameBoard[0][6].getText() == "x"){
                        gameBoard[0][6].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[0][7].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[0][7] && gameBoard[0][7].getText() == "")
                    {
                        gameBoard[0][7].setText("o");
                    }
                    else if(event.getSource() == gameBoard[0][7] && gameBoard[0][7].getText() == "o")
                    {
                        gameBoard[0][7].setText("x");
                    }
                    else if(event.getSource() == gameBoard[0][7] && gameBoard[0][7].getText() == "x"){
                        gameBoard[0][7].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][0] && gameBoard[1][0].getText() == "")
                    {
                        gameBoard[1][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][0] && gameBoard[1][0].getText() == "o")
                    {
                        gameBoard[1][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][0] && gameBoard[1][0].getText() == "x"){
                        gameBoard[1][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][1] && gameBoard[1][1].getText() == "")
                    {
                        gameBoard[1][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][1] && gameBoard[1][1].getText() == "o")
                    {
                        gameBoard[1][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][1] && gameBoard[1][1].getText() == "x"){
                        gameBoard[1][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][2] && gameBoard[1][2].getText() == "")
                    {
                        gameBoard[1][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][2] && gameBoard[1][2].getText() == "o")
                    {
                        gameBoard[1][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][2] && gameBoard[1][2].getText() == "x"){
                        gameBoard[1][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][3] && gameBoard[1][3].getText() == "")
                    {
                        gameBoard[1][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][3] && gameBoard[1][3].getText() == "o")
                    {
                        gameBoard[1][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][3] && gameBoard[1][3].getText() == "x"){
                        gameBoard[1][3].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][4] && gameBoard[1][4].getText() == "")
                    {
                        gameBoard[1][4].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][4] && gameBoard[1][4].getText() == "o")
                    {
                        gameBoard[1][4].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][4] && gameBoard[1][4].getText() == "x"){
                        gameBoard[1][4].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][5].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][5] && gameBoard[1][5].getText() == "")
                    {
                        gameBoard[1][5].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][5] && gameBoard[1][5].getText() == "o")
                    {
                        gameBoard[1][5].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][5] && gameBoard[1][5].getText() == "x"){
                        gameBoard[1][5].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][6].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][6] && gameBoard[1][6].getText() == "")
                    {
                        gameBoard[1][6].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][6] && gameBoard[1][6].getText() == "o")
                    {
                        gameBoard[1][6].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][6] && gameBoard[1][6].getText() == "x"){
                        gameBoard[1][6].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[1][7].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[1][7] && gameBoard[1][7].getText() == "")
                    {
                        gameBoard[1][7].setText("o");
                    }
                    else if(event.getSource() == gameBoard[1][7] && gameBoard[1][7].getText() == "o")
                    {
                        gameBoard[1][7].setText("x");
                    }
                    else if(event.getSource() == gameBoard[1][7] && gameBoard[1][7].getText() == "x"){
                        gameBoard[1][7].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][0] && gameBoard[2][0].getText() == "")
                    {
                        gameBoard[2][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][0] && gameBoard[2][0].getText() == "o")
                    {
                        gameBoard[2][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][0] && gameBoard[2][0].getText() == "x"){
                        gameBoard[2][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][1] && gameBoard[2][1].getText() == "")
                    {
                        gameBoard[2][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][1] && gameBoard[2][1].getText() == "o")
                    {
                        gameBoard[2][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][1] && gameBoard[2][1].getText() == "x"){
                        gameBoard[2][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][2] && gameBoard[2][2].getText() == "")
                    {
                        gameBoard[2][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][2] && gameBoard[2][2].getText() == "o")
                    {
                        gameBoard[2][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][2] && gameBoard[2][2].getText() == "x"){
                        gameBoard[2][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][3] && gameBoard[2][3].getText() == "")
                    {
                        gameBoard[2][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][3] && gameBoard[2][3].getText() == "o")
                    {
                        gameBoard[2][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][3] && gameBoard[2][3].getText() == "x"){
                        gameBoard[2][3].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][4] && gameBoard[2][4].getText() == "")
                    {
                        gameBoard[2][4].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][4] && gameBoard[2][4].getText() == "o")
                    {
                        gameBoard[2][4].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][4] && gameBoard[2][4].getText() == "x"){
                        gameBoard[2][4].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][5].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][5] && gameBoard[2][5].getText() == "")
                    {
                        gameBoard[2][5].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][5] && gameBoard[2][5].getText() == "o")
                    {
                        gameBoard[2][5].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][5] && gameBoard[2][5].getText() == "x"){
                        gameBoard[2][5].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][6].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][6] && gameBoard[2][6].getText() == "")
                    {
                        gameBoard[2][6].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][6] && gameBoard[2][6].getText() == "o")
                    {
                        gameBoard[2][6].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][6] && gameBoard[2][6].getText() == "x"){
                        gameBoard[2][6].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[2][7].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[2][7] && gameBoard[2][7].getText() == "")
                    {
                        gameBoard[2][7].setText("o");
                    }
                    else if(event.getSource() == gameBoard[2][7] && gameBoard[2][7].getText() == "o")
                    {
                        gameBoard[2][7].setText("x");
                    }
                    else if(event.getSource() == gameBoard[2][7] && gameBoard[2][7].getText() == "x"){
                        gameBoard[2][7].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][0] && gameBoard[3][0].getText() == "")
                    {
                        gameBoard[3][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][0] && gameBoard[3][0].getText() == "o")
                    {
                        gameBoard[3][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][0] && gameBoard[3][0].getText() == "x"){
                        gameBoard[3][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][1] && gameBoard[3][1].getText() == "")
                    {
                        gameBoard[3][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][1] && gameBoard[3][1].getText() == "o")
                    {
                        gameBoard[3][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][1] && gameBoard[3][1].getText() == "x"){
                        gameBoard[3][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][2] && gameBoard[3][2].getText() == "")
                    {
                        gameBoard[3][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][2] && gameBoard[3][2].getText() == "o")
                    {
                        gameBoard[3][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][2] && gameBoard[3][2].getText() == "x"){
                        gameBoard[3][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][3] && gameBoard[3][3].getText() == "")
                    {
                        gameBoard[3][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][3] && gameBoard[3][3].getText() == "o")
                    {
                        gameBoard[3][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][3] && gameBoard[3][3].getText() == "x"){
                        gameBoard[3][3].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][4] && gameBoard[3][4].getText() == "")
                    {
                        gameBoard[3][4].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][4] && gameBoard[3][4].getText() == "o")
                    {
                        gameBoard[3][4].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][4] && gameBoard[3][4].getText() == "x"){
                        gameBoard[3][4].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][5].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][5] && gameBoard[3][5].getText() == "")
                    {
                        gameBoard[3][5].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][5] && gameBoard[3][5].getText() == "o")
                    {
                        gameBoard[3][5].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][5] && gameBoard[3][5].getText() == "x"){
                        gameBoard[3][5].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][6].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][6] && gameBoard[3][6].getText() == "")
                    {
                        gameBoard[3][6].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][6] && gameBoard[3][6].getText() == "o")
                    {
                        gameBoard[3][6].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][6] && gameBoard[3][6].getText() == "x"){
                        gameBoard[3][6].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[3][7].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    
                    if(event.getSource() == gameBoard[3][7] && gameBoard[3][7].getText() == "")
                    {
                        gameBoard[3][7].setText("o");
                    }
                    else if(event.getSource() == gameBoard[3][7] && gameBoard[3][7].getText() == "o")
                    {
                        gameBoard[3][7].setText("x");
                    }
                    else if(event.getSource() == gameBoard[3][7] && gameBoard[3][7].getText() == "x"){
                        gameBoard[3][7].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[4][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[4][0] && gameBoard[4][0].getText() == "")
                    {
                        gameBoard[4][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[4][0] && gameBoard[4][0].getText() == "o")
                    {
                        gameBoard[4][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[4][0] && gameBoard[4][0].getText() == "x"){
                        gameBoard[4][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[4][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[4][1] && gameBoard[4][1].getText() == "")
                    {
                        gameBoard[4][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[4][1] && gameBoard[4][1].getText() == "o")
                    {
                        gameBoard[4][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[4][1] && gameBoard[4][1].getText() == "x"){
                        gameBoard[4][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[4][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[4][2] && gameBoard[4][2].getText() == "")
                    {
                        gameBoard[4][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[4][2] && gameBoard[4][2].getText() == "o")
                    {
                        gameBoard[4][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[4][2] && gameBoard[4][2].getText() == "x"){
                        gameBoard[4][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[4][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[4][3] && gameBoard[4][3].getText() == "")
                    {
                        gameBoard[4][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[4][3] && gameBoard[4][3].getText() == "o")
                    {
                        gameBoard[4][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[4][3] && gameBoard[4][3].getText() == "x"){
                        gameBoard[4][3].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[5][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[5][0] && gameBoard[5][0].getText() == "")
                    {
                        gameBoard[5][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[5][0] && gameBoard[5][0].getText() == "o")
                    {
                        gameBoard[5][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[5][0] && gameBoard[5][0].getText() == "x"){
                        gameBoard[5][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[5][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[5][1] && gameBoard[5][1].getText() == "")
                    {
                        gameBoard[5][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[5][1] && gameBoard[5][1].getText() == "o")
                    {
                        gameBoard[5][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[5][1] && gameBoard[5][1].getText() == "x"){
                        gameBoard[5][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[5][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[5][2] && gameBoard[5][2].getText() == "")
                    {
                        gameBoard[5][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[5][2] && gameBoard[5][2].getText() == "o")
                    {
                        gameBoard[5][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[5][2] && gameBoard[5][2].getText() == "x"){
                        gameBoard[5][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[5][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[5][3] && gameBoard[5][3].getText() == "")
                    {
                        gameBoard[5][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[5][3] && gameBoard[5][3].getText() == "o")
                    {
                        gameBoard[5][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[5][3] && gameBoard[5][3].getText() == "x"){
                        gameBoard[5][3].setText("");
                    }
                    checkWin();
                }
            });

        gameBoard[6][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[6][0] && gameBoard[6][0].getText() == "")
                    {
                        gameBoard[6][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[6][0] && gameBoard[6][0].getText() == "o")
                    {
                        gameBoard[6][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[6][0] && gameBoard[6][0].getText() == "x"){
                        gameBoard[6][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[6][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[6][1] && gameBoard[6][1].getText() == "")
                    {
                        gameBoard[6][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[6][1] && gameBoard[6][1].getText() == "o")
                    {
                        gameBoard[6][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[6][1] && gameBoard[6][1].getText() == "x"){
                        gameBoard[6][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[6][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[6][2] && gameBoard[6][2].getText() == "")
                    {
                        gameBoard[6][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[6][2] && gameBoard[6][2].getText() == "o")
                    {
                        gameBoard[6][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[6][2] && gameBoard[6][2].getText() == "x"){
                        gameBoard[6][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[6][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[6][3] && gameBoard[6][3].getText() == "")
                    {
                        gameBoard[6][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[6][3] && gameBoard[6][3].getText() == "o")
                    {
                        gameBoard[6][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[6][3] && gameBoard[6][3].getText() == "x"){
                        gameBoard[6][3].setText("");
                    }
                    checkWin();
                }
            });

        gameBoard[7][0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[7][0] && gameBoard[7][0].getText() == "")
                    {
                        gameBoard[7][0].setText("o");
                    }
                    else if(event.getSource() == gameBoard[7][0] && gameBoard[7][0].getText() == "o")
                    {
                        gameBoard[7][0].setText("x");
                    }
                    else if(event.getSource() == gameBoard[7][0] && gameBoard[7][0].getText() == "x"){
                        gameBoard[7][0].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[7][1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[7][1] && gameBoard[7][1].getText() == "")
                    {
                        gameBoard[7][1].setText("o");
                    }
                    else if(event.getSource() == gameBoard[7][1] && gameBoard[7][1].getText() == "o")
                    {
                        gameBoard[7][1].setText("x");
                    }
                    else if(event.getSource() == gameBoard[7][1] && gameBoard[7][1].getText() == "x"){
                        gameBoard[7][1].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[7][2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[7][2] && gameBoard[7][2].getText() == "")
                    {
                        gameBoard[7][2].setText("o");
                    }
                    else if(event.getSource() == gameBoard[7][2] && gameBoard[7][2].getText() == "o")
                    {
                        gameBoard[7][2].setText("x");
                    }
                    else if(event.getSource() == gameBoard[7][2] && gameBoard[7][2].getText() == "x"){
                        gameBoard[7][2].setText("");
                    }
                    checkWin();
                }
            });
        gameBoard[7][3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event){
                    if(event.getSource() == gameBoard[7][3] && gameBoard[7][3].getText() == "")
                    {
                        gameBoard[7][3].setText("o");
                    }
                    else if(event.getSource() == gameBoard[7][3] && gameBoard[7][3].getText() == "o")
                    {
                        gameBoard[7][3].setText("x");
                    }
                    else if(event.getSource() == gameBoard[7][3] && gameBoard[7][3].getText() == "x"){
                        gameBoard[7][3].setText("");
                    }
                    checkWin();
                }
            });

        Button btn2 = new Button();
        btn2.setText("Clear Errors");
        btn2.setTranslateX(170);
        btn2.setTranslateY(390);
        root.getChildren().add(btn2);
        
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(event.getSource() == btn2){
                    checkErrors();
                }
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Start Over");
        btn3.setTranslateX(260);
        btn3.setTranslateY(390);
        
         //This button listener controls the clear all button in the game
        btn3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(event.getSource() == btn3){
                    startGameOver();
                }
            }
        });
        
        root.getChildren().add(btn3);
        
        primaryStage.show();
    }
    
    //This method will be used to check if the user has succesfully completed
    //the puzzle. 
    public void checkWin(){
            if(gameBoard[0][0].getText().equals("x") && gameBoard[0][1].getText().equals("x")
                && gameBoard[0][2].getText().equals("x") && gameBoard[0][3].getText().equals("o") 
                && gameBoard[0][4].getText().equals("o") && gameBoard[0][5].getText().equals("x")
                && gameBoard[0][6].getText().equals("x") && gameBoard[0][7].getText().equals("x")
                && gameBoard[1][0].getText().equals("x") && gameBoard[1][1].getText().equals("o")
                && gameBoard[1][2].getText().equals("x") && gameBoard[1][3].getText().equals("x")
                && gameBoard[1][4].getText().equals("x") && gameBoard[1][5].getText().equals("x")
                && gameBoard[1][6].getText().equals("o") && gameBoard[1][7].getText().equals("x")
                && gameBoard[2][0].getText().equals("o") && gameBoard[2][1].getText().equals("x")
                && gameBoard[2][2].getText().equals("x") && gameBoard[2][3].getText().equals("x")
                && gameBoard[2][4].getText().equals("x") && gameBoard[2][5].getText().equals("x")
                && gameBoard[2][6].getText().equals("x") && gameBoard[2][7].getText().equals("o")
                && gameBoard[3][0].getText().equals("x") && gameBoard[3][1].getText().equals("x")
                && gameBoard[3][2].getText().equals("o") && gameBoard[3][3].getText().equals("x")
                && gameBoard[3][4].getText().equals("x") && gameBoard[3][5].getText().equals("o")
                && gameBoard[3][6].getText().equals("x") && gameBoard[3][7].getText().equals("x")
                && gameBoard[4][0].getText().equals("x") && gameBoard[4][1].getText().equals("x")
                && gameBoard[4][2].getText().equals("x") && gameBoard[4][3].getText().equals("o")
                && gameBoard[5][0].getText().equals("x") && gameBoard[5][1].getText().equals("x")
                && gameBoard[5][2].getText().equals("o") && gameBoard[5][3].getText().equals("x")
                && gameBoard[6][0].getText().equals("x") && gameBoard[6][1].getText().equals("o")
                && gameBoard[6][2].getText().equals("x") && gameBoard[6][3].getText().equals("x")
                && gameBoard[7][0].getText().equals("o") && gameBoard[7][1].getText().equals("x")
                && gameBoard[7][2].getText().equals("x") && gameBoard[7][3].getText().equals("x")){
                    System.out.println("Congratulations, you won the game! ! !");
                    System.exit(0);
                }           
        }
    public void checkErrors(){
        if(gameBoard[0][0].getText() != "x"){
            gameBoard[0][0].setText("");
        }
        if(gameBoard[0][1].getText() != "x"){
            gameBoard[0][1].setText("");
        }
        if(gameBoard[0][2].getText() != "x"){
            gameBoard[0][2].setText("");
        }
        if(gameBoard[0][3].getText() != "o"){
            gameBoard[0][3].setText("");
        }
        if(gameBoard[0][4].getText() != "o"){
            gameBoard[0][4].setText("");
        }
        if(gameBoard[0][5].getText() != "x"){
            gameBoard[0][5].setText("");
        }
        if(gameBoard[0][6].getText() != "x"){
            gameBoard[0][6].setText("");
        }
        if(gameBoard[0][7].getText() != "x"){
            gameBoard[0][7].setText("");
        }
        if(gameBoard[1][0].getText() != "x"){
            gameBoard[1][0].setText("");
        }
        if(gameBoard[1][1].getText() != "o"){
            gameBoard[1][1].setText("");
        }
        if(gameBoard[1][2].getText() != "x"){
            gameBoard[1][2].setText("");
        }
        if(gameBoard[1][3].getText() != "x"){
            gameBoard[1][3].setText("");
        }
        if(gameBoard[1][4].getText() != "x"){
            gameBoard[1][4].setText("");
        }
        if(gameBoard[1][5].getText() != "x"){
            gameBoard[1][5].setText("");
        }
        if(gameBoard[1][6].getText() != "x"){
            gameBoard[1][6].setText("");
        }
        if(gameBoard[1][7].getText() != "x"){
            gameBoard[1][7].setText("");
        }
        if(gameBoard[2][0].getText() != "o"){
            gameBoard[2][0].setText("");
        }
        if(gameBoard[2][1].getText() != "x"){
            gameBoard[2][1].setText("");
        }
        if(gameBoard[2][2].getText() != "x"){
            gameBoard[2][2].setText("");
        }
        if(gameBoard[2][3].getText() != "x"){
            gameBoard[2][3].setText("");
        }
        if(gameBoard[2][4].getText() != "x"){
            gameBoard[2][4].setText("");
        }
        if(gameBoard[2][5].getText() != "x"){
            gameBoard[2][5].setText("");
        }
        if(gameBoard[2][6].getText() != "x"){
            gameBoard[2][6].setText("");
        }
        if(gameBoard[2][7].getText() != "o"){
            gameBoard[2][7].setText("");
        }
        if(gameBoard[3][0].getText() != "x"){
            gameBoard[3][0].setText("");
        }
        if(gameBoard[3][1].getText() != "x"){
            gameBoard[3][1].setText("");
        }
        if(gameBoard[3][2].getText() != "o"){
            gameBoard[3][2].setText("");
        }
        if(gameBoard[3][3].getText() != "x"){
            gameBoard[3][3].setText("");
        }
        if(gameBoard[3][4].getText() != "x"){
            gameBoard[3][4].setText("");
        }
        if(gameBoard[3][5].getText() != "o"){
            gameBoard[3][5].setText("");
        }
        if(gameBoard[3][6].getText() != "x"){
            gameBoard[3][6].setText("");
        }
        if(gameBoard[3][7].getText() != "x"){
            gameBoard[3][7].setText("");
        }
        if(gameBoard[4][0].getText() != "x"){
            gameBoard[4][0].setText("");
        }
        if(gameBoard[4][1].getText() != "x"){
            gameBoard[4][1].setText("");
        }
        if(gameBoard[4][2].getText() != "x"){
            gameBoard[4][2].setText("");
        }
        if(gameBoard[4][3].getText() != "o"){
            gameBoard[4][3].setText("");
        }
        if(gameBoard[5][0].getText() != "x"){
            gameBoard[5][0].setText("");
        }
        if(gameBoard[5][1].getText() != "x"){
            gameBoard[5][1].setText("");
        }
        if(gameBoard[5][2].getText() != "o"){
            gameBoard[5][2].setText("");
        }
        if(gameBoard[5][3].getText() != "x"){
            gameBoard[5][3].setText("");
        }
        if(gameBoard[6][0].getText() != "x"){
            gameBoard[6][0].setText("");
        }
        if(gameBoard[6][1].getText() != "o"){
            gameBoard[6][1].setText("");
        }
        if(gameBoard[6][2].getText() != "x"){
            gameBoard[6][2].setText("");
        }
        if(gameBoard[6][3].getText() != "x"){
            gameBoard[6][3].setText("");
        }
        if(gameBoard[7][0].getText() != "o"){
            gameBoard[7][0].setText("");
        }
        if(gameBoard[7][1].getText() != "x"){
            gameBoard[7][1].setText("");
        }
        if(gameBoard[7][2].getText() != "x"){
            gameBoard[7][2].setText("");
        }
        if(gameBoard[7][3].getText() != "x"){
            gameBoard[7][3].setText("");
        }
        
    }
    //This method clears all the text for the buttons which "resets" all of the 
    //answers input by the user.
    public void startGameOver(){
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 8; j++) {
                gameBoard[i][j].setText("");
            }
        }
        for(int i = 4; i < 8; i++) {
            for(int j = 0; j < 4; j++) {
                gameBoard[i][j].setText("");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }   
}