package life.dashyeah.TetrisRemake;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Label;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.UIManager;

public class SidePanel extends JPanel {
	public SidePanel() {
		setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		setLayout(null);
		
		JLabel label_1 = new JLabel("\u4E0B\u4E00\u5757\uFF1A");
		label_1.setBounds(10, 10, 75, 25);
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 18));
		add(label_1);
		
		JLabel label = new JLabel("\u5F53\u524D\u72B6\u6001\uFF1A");
		label.setBounds(10, 100, 90, 24);
		label.setFont(new Font("华文楷体", Font.PLAIN, 18));
		add(label);
		
		JLabel score0 = new JLabel("\u5F97\u5206:");
		score0.setBounds(20, 130, 40, 20);
		score0.setFont(new Font("楷体", Font.PLAIN, 16));
		add(score0);
		
		JLabel scoreLabel = new JLabel("0000");
		scoreLabel.setBounds(70, 130, 32, 21);
		scoreLabel.setFont(new Font("华文楷体", Font.PLAIN, 16));
		add(scoreLabel);
		
		JLabel speed0 = new JLabel("\u901F\u5EA6:");
		speed0.setBounds(20, 155, 40, 19);
		speed0.setFont(new Font("楷体", Font.PLAIN, 16));
		add(speed0);
		
		JLabel speedLabel = new JLabel("0000");
		speedLabel.setBounds(70, 155, 32, 21);
		speedLabel.setFont(new Font("华文楷体", Font.PLAIN, 16));
		add(speedLabel);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(30, 45, 30, 30);
		add(table);
	}

	/**
	 * generated serialVersionUID by system
	 */
	private static final long serialVersionUID = -4684766393218931426L;
	private JTable table;
}
