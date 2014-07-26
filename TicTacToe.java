/**
 * <p>This application creates a tic-tac-toe game.</p>
 * 
 * <u>Grading level</u>: Standard
 * 
 * @author Sean Bucholtz
 * @version Assignment 10: Tic-Tac-Toe
 */
@SuppressWarnings("serial")
public class TicTacToe extends NsccWindow implements java.awt.event.ActionListener {
  
  // declare button storage array
  private Object[] buttons;
  // declare player prompt
  private javax.swing.JLabel prompt;
  // declare turn sentinal 
  private String turn;
  
  /**
   * zero-parameter constructor
   */
  public TicTacToe() {
    // instantiate new window instance
    super(10,10,235,280);
    // declare rectangle object for gridline
    NsccRectangle gridLine;
    // set window title
    this.setTitle("Tic-Tac-Toe");
    // instantiates button array
    buttons = new Object[9];
    // fill button array with button objects
    for (int i = 0; i < 9; i ++) {
      // instantiate new button object
      javax.swing.JButton btn = new javax.swing.JButton();
      // set button size
      btn.setSize(50,50);
      // set button location by index value
      switch (i) {
        case 0: btn.setLocation(30,30);
        break;
        case 1: btn.setLocation(85,30);
        break;
        case 2: btn.setLocation(140,30);
        break;
        case 3: btn.setLocation(30,85);
        break;
        case 4: btn.setLocation(85, 85);
        break;
        case 5: btn.setLocation(140, 85);
        break;
        case 6: btn.setLocation(30,140);
        break;
        case 7: btn.setLocation(85,140);
        break;
        case 8: btn.setLocation(140, 140);
        break;
      }
      // add action listener to button
      btn.addActionListener(this);
      // add button to array
      buttons[i] = btn;
    }
    // instantiate user prompt to X turn
    prompt = new javax.swing.JLabel("X's turn", javax.swing.JLabel.CENTER);
    // set prompt size
    prompt.setSize(160, 20);
    // set prompt location
    prompt.setLocation(30,200);
    // add prompt to window
    this.add(prompt);
    // instantiate and assign turn setinal to x-turn
    turn = "x"; 
    // instantiate new rectangle object for gridline
    gridLine = new NsccRectangle(80,30,5,160);
    // set gridline background
    gridLine.setBackground(java.awt.Color.black);
    // set filled
    gridLine.setFilled(true);
    // add gridline to window
    this.add(gridLine);
    // instantiate new rectangle object for gridline
    gridLine = new NsccRectangle(135,30,5,160);
    // set gridline background
    gridLine.setBackground(java.awt.Color.black);
    // set filled
    gridLine.setFilled(true);
    // add gridline to window
    this.add(gridLine);
    // instantiate new rectangle object for gridline
    gridLine = new NsccRectangle(30,80,160,5);
    // set gridline background
    gridLine.setBackground(java.awt.Color.black);
    // set filled
    gridLine.setFilled(true);
    // add gridline to window
    this.add(gridLine);
    // instantiate new rectangle object for gridline
    gridLine = new NsccRectangle(30,135,160,5);
    // set gridline background
    gridLine.setBackground(java.awt.Color.black);
    // set filled
    gridLine.setFilled(true);
    // add gridline to window
    this.add(gridLine);
    // cycle through button array
    for (int i = 0; i < buttons.length; i++) {
      // add button to window
      this.add((javax.swing.JButton) buttons[i]);
    }
    // repaint window
    this.repaint();
  }
  
  /**
   * method changes the state of the tic-tac-toe game.
   * 
   * @param e the event that occured
   */
  public void actionPerformed(java.awt.event.ActionEvent e) {
    // declare button object
    javax.swing.JButton button;
    // instantiate button and assign the reference to the button that was clicked
    button = (javax.swing.JButton) e.getSource();
    // conditional statment for turn sentinal
    if(turn.equals("x")) {
      // set button text
      button.setText("X");
      // disable button
      button.setEnabled(false);
      // change user prompt
      prompt.setText("O's turn");
      // reassign turn sentinal
      turn = "o";
    } else {
      // set button text
      button.setText("O");
      // disable button
      button.setEnabled(false);
      // change user prompt
      prompt.setText("X's turn");
      // reassign turn sentinal
      turn = "x";
    }
  }
  
  /**
   * application method.
   * 
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    // instantiate new instance of the class
    new TicTacToe();
  }
}