/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Pakistan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label scorelabel2;
    @FXML
    private Button getscore;
    @FXML
    private Button b7;
    @FXML
    private Label label;
    @FXML
    private TextField textlabel;
    @FXML
    private RadioButton b3;
    @FXML
    private RadioButton quit;
    @FXML
    private RadioButton instruction;
    @FXML 
    private Button b4;
    @FXML 
    private Button b5;
    @FXML
    private RadioButton q1opta;
    @FXML
    private RadioButton q1optb;
    @FXML
    private RadioButton q1optc;
    @FXML
    private RadioButton q1optd;
    @FXML 
    private Label scorelabel;
    @FXML
    private Label qslabel;
    @FXML
    private Label lifelabel;
    @FXML
    private Label anslabelq1;
    @FXML
    private Button submitQ1;
    @FXML
    private Button leavebutton;
    
    @FXML   
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        Parent homepage = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
          
    }
    
   
    public void fieldCheck() throws IOException
    {
              if(textlabel.getText().trim().isEmpty())  
              {
                  JOptionPane.showMessageDialog(null, "Empty Field",
      "Field is Empty!", JOptionPane.ERROR_MESSAGE);

              }             
              else
              {
                  
        Parent homepage = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
              }
              
    }
    public void end()
    {
     JOptionPane.showMessageDialog(null, "Connection Ended",
      "Bye!", JOptionPane.INFORMATION_MESSAGE);   
    }
    
    public void GameStart() throws IOException, InterruptedException
    {
        
           
        Parent homepage = FXMLLoader.load(getClass().getResource("firstScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
    
            scorelabel.setText("Score = " +score);
            qslabel.setText( "Question =  "+qs);
            lifelabel.setText("Life Remaining = "+life);
    }
    public void InstructionScreen() throws IOException
    {
        if (instruction.isPressed())
        {
        Parent homepage = FXMLLoader.load(getClass().getResource("Inst.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        }
    }
    int score ;
    int qs = 8;
    int life = 1;

    
    
    public void CorrectAnsq1() throws IOException, InterruptedException
    {
        
   if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
         Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   }
   
   else
   {
        Thread.sleep(300);
        score= score+10;
        Parent homepage = FXMLLoader.load(getClass().getResource("secondScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
 
        
   }
   
  
//        if (q1opta.isPressed())
//        
//        {
//            score = score+10;
//            scorelabel.setText(" Score = "+score);
//            qs--;
//            qslabel.setText( "Question =  "+qs);
//            lifelabel.setText("Life Remaining = "+life);
//            anslabelq1.setText("You Answer is Correct ! ");
//        Parent homepage = FXMLLoader.load(getClass().getResource("secondScreen.fxml"));
//        Scene homepagescene = new Scene(homepage);
//        Stage appstage=new Stage();
//        appstage.hide();
//        appstage.setScene(homepagescene);
//        appstage.show();
//           
//        
//        }
         
    }
    

    public void wrongAnsq1() throws IOException, InterruptedException
    {
   
        if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        if (q1optb.isPressed()||q1optc.isPressed()||q1optd.isPressed())
        
          {
           life--;
        Parent homepage = FXMLLoader.load(getClass().getResource("secondScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }
        
    }
    
    public void CorrectAnsq2() throws IOException, InterruptedException
    {
    
        if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   
   }
//         if (q1opta.isPressed())
//     
//        {
//            score = score+10;
//            scorelabel.setText(" Score = "+score);
//            qs--;
//            qslabel.setText( "Question =  "+qs);
//            lifelabel.setText("Life Remaining = "+life);
//            anslabelq1.setText("You Answer is Correct ! ");
//        Parent homepage = FXMLLoader.load(getClass().getResource("ThirdScreen.fxml"));
//        Scene homepagescene = new Scene(homepage);
//        Stage appstage=new Stage();
//        appstage.hide();
//        appstage.setScene(homepagescene);
//        appstage.show();
//            
//        }

else
        {
            
        Thread.sleep(300);
                 score= score+10;
   
        Parent homepage = FXMLLoader.load(getClass().getResource("ThirdScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
               
        }
         
    }
    
    public void wrongAnsq2 () throws IOException, InterruptedException
    {
    
        if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        if (q1optb.isPressed()||q1optc.isPressed()||q1optd.isPressed())
        
          {
          life--;
        Parent homepage = FXMLLoader.load(getClass().getResource("ThirdScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }
        
    }
    
    public void Lifelineq2() throws IOException, InterruptedException
    {
        if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        Parent homepage = FXMLLoader.load(getClass().getResource("second5050.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   
    }
    
    
    
    public void CorrectAnsq3() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }    
//         if (q1opta.isPressed())
//        
//        {   score = score+10;
//            scorelabel.setText(" Score = "+score);
//            qs--;
//            qslabel.setText( "Question =  "+qs);
//            lifelabel.setText("Life Remaining = "+life);
//            anslabelq1.setText("You Answer is Correct ! ");
//        Parent homepage = FXMLLoader.load(getClass().getResource("FourthScreen.fxml"));
//        Scene homepagescene = new Scene(homepage);
//        Stage appstage=new Stage();
//        appstage.hide();
//        appstage.setScene(homepagescene);
//        appstage.show();
//        
//        }
//         
 else
    {
                 score= score+10;
   
        Parent homepage = FXMLLoader.load(getClass().getResource("FourthScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
                
    }
    }
    
    public void wrongAnsq3 () throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        if (q1optb.isPressed()||q1optc.isPressed()||q1optd.isPressed())
        
          {
           life--;
        Parent homepage = FXMLLoader.load(getClass().getResource("FourthScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }
        
    }
    
    public void Lifelineq3() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
      Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   }
        Parent homepage = FXMLLoader.load(getClass().getResource("third5050.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   
    }
    
    
    
    public void CorrectAnsq4() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }    
//         if (q1opta.isPressed())
//        
//        {   
//          score = score+10;
//            scorelabel.setText(" Score = "+score);
//            qs--;
//            qslabel.setText( "Question =  "+qs);
//            lifelabel.setText("Life Remaining = "+life);
//            anslabelq1.setText("You Answer is Correct ! ");
//        Parent homepage = FXMLLoader.load(getClass().getResource("SixthScreen.fxml"));
//        Scene homepagescene = new Scene(homepage);
//        Stage appstage=new Stage();
//        appstage.hide();
//        appstage.setScene(homepagescene);
//        appstage.show();
//        
//        }

else
    {
         score= score+10;
   
        Parent homepage = FXMLLoader.load(getClass().getResource("SixthScreen.fxml"));

             Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
           
    }
    }
    
    public void wrongAnsq4 () throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        if (q1optb.isPressed()||q1optc.isPressed()||q1optd.isPressed())
        
          {
         life--;
        Parent homepage = FXMLLoader.load(getClass().getResource("Fifth.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }
        
    }
    
    public void Lifelineq4() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
      Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   }
        Parent homepage = FXMLLoader.load(getClass().getResource("Fourth5050.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   
    }
    
    public void scoreCollect()
    {
        score=40;
        scorelabel2.setText(" "+score);
        
    }
    
    public void CorrectAnsq5() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }    
//         if (q1opta.isPressed())
//        
//        {   score = score+10;
//            scorelabel.setText(" Score = "+score);
//            qs--;
//            qslabel.setText( "Question =  "+qs);
//            lifelabel.setText("Life Remaining = "+life);
//            anslabelq1.setText("You Answer is Correct ! ");
//     
//            Parent homepage = FXMLLoader.load(getClass().getResource("SixthScreen.fxml"));
//        Scene homepagescene = new Scene(homepage);
//        Stage appstage=new Stage();
//        appstage.hide();
//        appstage.setScene(homepagescene);
//        appstage.show();
//        
//        }

else
    {
                 score= score+10;
   
         Parent homepage = FXMLLoader.load(getClass().getResource("SixthScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }

    }
    
    public void wrongAnsq5 () throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
   Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
   }
        if (q1optb.isPressed()||q1optc.isPressed()||q1optd.isPressed())
        
          {
      life--;
        Parent homepage = FXMLLoader.load(getClass().getResource("SixthScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        
        }
        
    }
    
    public void Lifelineq5() throws IOException, InterruptedException
    {
    if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
      Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   }
        Parent homepage = FXMLLoader.load(getClass().getResource("Fifth5050.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   
    }
    
    public void Lifelineq1() throws IOException, InterruptedException
    {
        if (life == 0 )
   {
         JOptionPane.showMessageDialog(null, "NO MORE LIVES",
      "SORRY , YOU LOST !", JOptionPane.ERROR_MESSAGE);
Thread.sleep(1500);
      Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   }
        Parent homepage = FXMLLoader.load(getClass().getResource("first5050Screen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
   
    }
    public void QuitScreenDisplay() throws IOException
    {
        if (quit.isPressed())
        {
            Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
        }
    }
    
    public void LeaveGame() throws IOException
    {
        Parent homepage = FXMLLoader.load(getClass().getResource("QuitScreen.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();   
    }
    
    public void MenuScreen() throws IOException
    {
         Parent homepage = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene homepagescene = new Scene(homepage);
        Stage appstage=new Stage();
        appstage.hide();
        appstage.setScene(homepagescene);
        appstage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
