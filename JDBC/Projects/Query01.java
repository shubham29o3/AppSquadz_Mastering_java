import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class Query01 {
    public static void main(String[] args) {
        Connect con = new Connect();
        //new CreateFirstForm();
    }
}
class CreateFirstForm{
    StringBuffer strQuery = new StringBuffer("select "); //to store prepared query
    StringBuffer orderbyBuffer = new StringBuffer(" ");
    StringBuffer criteriaBuffer = new StringBuffer(" ");
    int createQueryStatus =0;

    JFrame jf1;
    JLabel jl1,jl2,jl3,jl4,jl5;
    JComboBox jcom1,jcom2,jcom3;
    JTextField jtf1;
    JList jlist1,jlist2;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jbtemp;
    JCheckBox jcb1;
    JRadioButton jrb1,jrb2,jrb3;
    JScrollPane jsp1,jsp2;
    ButtonGroup bg1;
    JFrame jf11;
    JButton jb11 = new JButton("Add");
    JButton jb12 = new JButton("Ok");
    JButton jb13 = new JButton("Cancel");
    JComboBox jcom11;
    JRadioButton jrb11 = new JRadioButton("Ascending");
    JRadioButton jrb12 = new JRadioButton("Descending");

    CreateFirstForm(){
        jf1 = new JFrame("Query Builder");
        jf1.setSize(700,550);
        jf1.setLocation(50,30);
        jf1.setLayout(null);

        jl1 = new JLabel("Table to be Queried ");
        jl1.setBounds(40,10,200,25);
        jf1.add(jl1);

        jb1 = new JButton("Refresh");
        jb1.setBounds(300,40,100,25);
        jf1.setBounds(300,40,100,25);
        jf1.add(jb1);

        jlist1 = new JList(); //add jlist to jscrollpane
        jsp1 = new JScrollPane(jlist1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp1.setBounds(40,80,200,200);
        jf1.add(jsp1);

        jb2 = new JButton(" >> ");
        jb2.setBounds(280,120,135,25);
        jf1.add(jb2);

        jb3 = new JButton(" << ");
        jb3.setBounds(280,160,135,25);
        jf1.add(jb3);

        jb4 = new JButton(" << ");
        jb4.setBounds(280,200,135,25);
        jf1.add(jb4);

        jcb1 = new JCheckBox("Order By");
        jcb1.setBounds(300,250,135,30);
        jf1.add(jcb1);

        jlist2 = new JList();
        jsp2 = new JScrollPane(jlist2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(450,80,200,200);
        jf1.add(jsp2);

        jl2 = new JLabel("Criteria ");  jl2.setBounds(40,350,200,25);  jf1.add(jl2);
        jl2 = new JLabel("Fields    :");  jl2.setBounds(40,400,200,25);  jf1.add(jl3);
        jl2 = new JLabel("Operators :");  jl2.setBounds(40,435,200,25);  jf1.add(jl4);
        jl2 = new JLabel("Value     : ");  jl2.setBounds(40,470,200,25);  jf1.add(jl5);

        jcom2 = new JComboBox(); jcom2.addItem("---None---");
        jcom2.setBounds(150,400,200,25);
        jf1.add(jcom2);

        Vector temp = new Vector(0,1);
        temp.add("---None---");
        temp.add("=");
        temp.add("!=");
        temp.add(">");
        temp.add(">=");
        temp.add("<");
        temp.add("<=");
        temp.add("like");
        temp.add("soundex");
        temp.add("between");
        temp.add("in");

        jcom3 = new JComboBox(temp);
        jcom3.setBounds(150,435,200,25);
        jf1.add(jcom3);

        jtf1 = new JTextField("Enter Value");
        jtf1.setBounds(150,470,200,25);
        jf1.add(jrb1);

        jrb1 = new JRadioButton("AND");
        jrb1.setBounds(380,400,60,25);
        jf1.add(jrb1);

        jrb2 = new JRadioButton("OR");
        jrb2.setBounds(380,435,60,25);
        jf1.add(jrb2);

        jrb3 = new JRadioButton("None");
        jrb1.setBounds(380,470,60,25);
        jf1.add(jrb3);

        bg1 = new ButtonGroup();
        bg1.add(jrb1);
        bg1.add(jrb2);
        bg1.add(jrb3);
        jrb3.setSelected(true);

        jb5 = new JButton("Go");
        jb5.setBounds(580,410,100,25);
        jf1.add(jb5);

        jb6 = new JButton("Query");
        jb6.setBounds(580,440,100,25);
        jf1.add(jb6);

        jb7 = new JButton("Query");
        jb7.setBounds(580,470,100,30);
        jf1.add(jb7);

        jbtemp = new JButton("OK");
        jbtemp.setBounds(470,1000,60,25);
        jf1.add(jbtemp);

        jf1.setVisible(true);

        QueryEvent qev = new QueryEvent(this);
        jb1.addActionListener(qev);
        jb2.addActionListener(qev);
        jb3.addActionListener(qev);
        jb4.addActionListener(qev);
        jb5.addActionListener(qev);
        jb6.addActionListener(qev);
        jb7.addActionListener(qev);

        jrb1.addActionListener(qev);
        jrb2.addActionListener(qev);
        jbtemp.addActionListener(qev);

        jcb1.addActionListener(qev);
    }
}

class QueryEvent implements ActionListener{
    CreateFirstForm cff;
    QueryEvent(CreateFirstForm cff1){
        cff=cff1;
    }
    public void actionPerformed(ActionEvent ae){
        int numberOfColumns =0;

        if(ae.getSource() == cff.jb1){
            cff.orderbyBuffer = new StringBuffer(" ");
            cff.criteriaBuffer = new StringBuffer(" ");

            cff.jrb3.setSelected(true);
            cff.createQueryStatus=0;
            cff.strQuery = new StringBuffer("select ");

            Connect.fieldNames = new Vector(0,1); //to blank jlist2
            cff.jlist2.setListData(Connect.fieldNames); //will set column names into jlist2

            try{
                Connection c = DriverManager.getConnection(Connect.dsnName);
                Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

                //now find column names
                String str = cff.jcom1.getSelectedIndex().toString();
                ResultSet rs = s.executeQuery("select * from " +str);

                ResultSetMetaData rsmd = rs.getMetaData();
                numberOfColumns = rsmd.getColumnCount();

                Connect.columnNames = new Vector(0,1);
                for(int i =1;i<=numberOfColumns;i++){
                    Connect.columnNames.add(rsmd.getColumnName(i));
                }
                //System.out.println(Connect.columnNames+ " "+numberOfColumns);
                cff.jlist1.setListData(Connect.columnNames); // will set column names into list
            }
            catch (SQLException e){
                System.out.println("Query Event Table does not Exist");
            }
            catch (Exception e){
                System.out.println("Query Event Simple Exception");
            }
            cff.jf1.remove(cff.jcom2); //refreshing jcom2

            Vector temp = new Vector(0,1);
            temp.add("---None---");
            for (int i = 0; i <numberOfColumns; i++) {
                temp.add(Connect.columnNames.elementAt(i));
            }
            cff.jcom2 = new JComboBox(temp);
            cff.jcom2.setBounds(150,400,200,25);
            cff.jf1.add(cff.jcom2);

            cff.jcom2.showPopup();
            cff.jcom2.hidePopup();
            cff.jcom3.setSelectedIndex(0);
//            cff.jcom3.showPopup();
//            cff.jcom3.hidePopup();
            cff.jtf1.setText("Enter Value");

            cff.jf1.setVisible(true);
        }
        ///////////////////
        //////////////////////
        if(ae.getSource() == cff.jb2){
            int sel[] = new int[10];
            for (int i = 0; i < 10; i++) {
                sel[i]=0;
            }
            int count =0; //count stores no of elements in jlist144
            count = Connect.columnNames.size();

            for (int i = 0; i < count; i++) {
                if(cff.jlist1.isSelectedIndex(i)==true)
                    sel[i]=1;
            }
            for(int i=0;i<count;i++)
                if(sel[i]==1)
                    if(Connect.fieldNames.contains(Connect.columnNames.elementAt(i))==false)
                        Connect.fieldNames.add(Connect.columnNames.elementAt(i));

                        cff.jlist2.setListData(Connect.fieldNames); //will set column names into jlist2
                        cff.jlist1.clearSelection();



        }
        else {
            cff.jlist1.clearSelection();
        }
        //////////////////////////////
        ///////////////////////////////
        if(ae.getSource() == cff.jb3){
            int sel[] = new int[10];
            for(int i =0;i<10;i++)
                sel[i] =0;

            int count =0;
            count = Connect.fieldNames.size();
            System.out.println(" ## " +count);

            for(int i =0; i<count;i++)
                if(cff.jlist2.isSelectedIndex(i)==true)
                    sel[i] ==1;

            for(int i =0;i<count;i++)
                if(sel[i] ==1)
                    Connect.fieldNames.remove(i);

            cff.jlist2.setListData(Connect.fieldNames); //will set column names into jlist2
        }
        ////////////////////////////////////
        ///////////////////////////////////
        if(ae.getSource()==cff.jb4){
            Connect.fieldNames.removeAllElements();
            cff.jlist2.setListData(Connect.fieldNames);//will column names into jlist2
        }
        ////////////////////////////
        ///////////////////////////
        if(ae.getSource()==cff.jb5){
            new TableResult(cff.strQuery);
        }
        /////////////////////////////
        /////////////////////////////328
        if(ae.getSource() == cff.jb6){
            if(cff.createQueryStatus ==0){
                int count = Connect.fieldNames.size();
                for(int i =0;i<count; i++) //adding col names to query
                {
                    StringBuffer buf = new StringBuffer(Connect.fieldNames.elementAt(i).toString());
                    if(i<count-1) cff.strQuery.append(buf.append(", "));
                    else cff.strQuery.append(buf);
                }
                if(cff.strQuery.toString().equals("select "))
                    cff.strQuery.append("*");
                cff.strQuery.append(" from " + cff.jcom1.getSelectedItem()); //adding table names to query

                //System.out.println("$$" + cff.criteriaBuffer+ "$$");
                if(cff.criteriaBuffer.toString().equals(" ") ==true){
                    //System.out.println(" &&& ");
                    if((cff.jcom2.getSelectedItem().equals("---None---")==false)
                    && (cff.jcom3.getSelectedItem().equals("---None---") ==false)
                    && (cff.jf1.getText().equals("Enter Value")==false))
                    {
                        cff.criteriaBuffer.append("where ");
                        cff.criteriaBuffer.append(cff.jcom2.getSelectedItem().toString());
                        cff.criteriaBuffer.append(" "+cff.jcom3.getSelectedItem().toString());
                        cff.criteriaBuffer.append(" "+cff.jtf1.getText());
                    }
                }
                cff.createQueryStatus =1;
            }
            else {
               // System.out.println(" @@@ ");
            }
            cff.strQuery.append(cff.criteriaBuffer);
            cff.strQuery.append(cff.orderbyBuffer);
            cff.orderbyBuffer= new StringBuffer(" ");
            cff.criteriaBuffer= new StringBuffer(" ");

            System.out.println(cff.strQuery);
            //cff.strQuery = new StringBuffer(" ");
        }
        /////////////////////////
        //////////////////////////

        if(ae.getSource() == cff.jb7){
            System.exit(0);
        }
        /////////////////////////
        ///////////////////////////
        if(ae.getSource() == cff.jrb1 || ae.getSource() == cff.jrb2){
            cff.criteriaBuffer.append("where ");
            cff.criteriaBuffer.append(cff.jcom2.getSelectedItem().toString());
            cff.criteriaBuffer.append(" "+cff.jcom3.getSelectedItem().toString());
            cff.criteriaBuffer.append(" " + cff.jtf1.getText());
        }
        System.out.println(cff.criteriaBuffer);
        cff.jbtemp.setBounds(450,400,60,25);
    }
    ////////////////////////////////
    ///////////////////////////////401
}