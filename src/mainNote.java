import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainNote extends JFrame implements ActionListener {
    private JMenuBar mainMenu;
    private JMenu File,Edit,View;
    private JMenuItem nnew,exit,closeProject,delete,copy,paste,Move,Run,Send;
    private JLabel Code,CCS;
    private JTextField typecode,typeccs;
    private JButton sendcode,clearcode;
    final int width=500;
    final int height=500;
    public mainNote(){
        mainMenu= new JMenuBar();
        File=new JMenu("File");
        Edit=new JMenu("Edit");
        View=new JMenu("View");
        nnew=new JMenuItem("New");
        exit=new JMenuItem("Exit");
        closeProject=new JMenuItem("CloseProject");
        delete=new JMenuItem("Delete");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        Move=new JMenuItem("Move");
        Run=new JMenuItem("Run");
        Send=new JMenuItem("Send");
        Code=new JLabel("Type code");
        CCS=new JLabel("Type ccs ");
        typeccs=new JTextField(1000);
        typecode=new JTextField(1000);
        sendcode=new JButton("PRINT CODE");
        clearcode=new JButton("CLEAR CODE");

        setSize(width,height);
        Container pane=getContentPane();
        pane.setLayout(new GridLayout(1,2));

        nnew.addActionListener(this);
        exit.addActionListener(this);
        closeProject.addActionListener(this);

        setJMenuBar(mainMenu);
        mainMenu.add(File);
        mainMenu.add(Edit);
        mainMenu.add(View);

        File.add(nnew);
        File.add(exit);
        File.add(closeProject);

        Edit.add(delete);
        Edit.add(copy);
        Edit.add(paste);

        View.add(Move);
        View.add(Run);
        View.add(Send);

        pane.add(Code);
        pane.add(typecode);
        pane.add(CCS);
        pane.add(typeccs);
        pane.add(sendcode);
        pane.add(clearcode);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent even) {
        if (even.getSource()==nnew){
            System.out.println("Opening new file");
        }
        if (even.getSource()==closeProject){
            System.out.println("Closing project");
        }
        if (even.getSource()==exit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        mainNote myNote=new mainNote();
    }
}
