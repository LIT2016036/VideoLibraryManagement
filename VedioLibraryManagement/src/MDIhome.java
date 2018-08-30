import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MDIhome extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDIhome frame = new MDIhome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MDIhome() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setBounds(100, 100, 450, 300);
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		JDesktopPane desktopPane_1 = new JDesktopPane();
		getContentPane().add(desktopPane_1, BorderLayout.CENTER);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCds = new JMenu("cds");
		menuBar.add(mnCds);
		
		JMenuItem mntmAdd = new JMenuItem("add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add_Cd ac=new Add_Cd();
			    desktopPane.add(ac);
				ac.setVisible(true);
				
			}
		});
		mnCds.add(mntmAdd);
		
		JMenuItem mntmSearch = new JMenuItem("search");
		mnCds.add(mntmSearch);
		
		JMenu mnCustomer = new JMenu("customer");
		menuBar.add(mnCustomer);
		
		JMenuItem mntmAdd_1 = new JMenuItem("add");
		mnCustomer.add(mntmAdd_1);
		
		JMenuItem mntmSearch_1 = new JMenuItem("search");
		mnCustomer.add(mntmSearch_1);
		
		JMenu mnTransaction = new JMenu("transaction");
		menuBar.add(mnTransaction);
		
		JMenuItem mntmIssue = new JMenuItem("issue");
		mnTransaction.add(mntmIssue);
		
		JMenuItem mntmReturn = new JMenuItem("return");
		mnTransaction.add(mntmReturn);
		
		JMenuItem mntmDefaulters = new JMenuItem("defaulters");
		mnTransaction.add(mntmDefaulters);
		

		
	}
}
