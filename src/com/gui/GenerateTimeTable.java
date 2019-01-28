package com.gui;

import com.data_structure.DBConnect;
import com.data_structure.DBConnect1;
import com.timetable.Data;
import com.timetable.GeneticAlgorithm;
import com.timetable.Population;
import com.timetable.Schedule;
import java.util.ArrayList;

public class GenerateTimeTable extends javax.swing.JInternalFrame {
        
    public static final int POPULATION_SIZE = 9;
    public static final double MUTATION_RATE = 0.1;
    public static final double CROSSOVER_RATE = 0.9;
    public static final int TOURNAMENT_SELECTION_SIZE = 3;
    public static final int NUMB_OF_ELITE_SCHEDULES = 1;
    private int scheduleNumb = 0;
    private int classNumb = 1;
    private Data data;
        
    public GenerateTimeTable() {
        DBConnect.connect();
        DBConnect1.connect();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        report = new javax.swing.JTextArea();
        generate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(847, 533));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 12, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(596, 488));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIME TABLE GENERATION REPORT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 80, 35));

        report.setEditable(false);
        report.setColumns(20);
        report.setRows(5);
        jScrollPane1.setViewportView(report);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, 410));

        generate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        generate.setText("Generate");
        generate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 280, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        report.setText("");
        
        generate.setText("Regenerate");
        boolean is_complete = false;
        
        try{
            data = new Data();
            
            printAvailableData();
            int generationNumber = 0;
            GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(data);
            Population population = new Population(POPULATION_SIZE, data).sortByFitness();
            printScheduleAsTable(population.getSchedules().get(0), generationNumber);

            classNumb = 1;
            int numb = 0;
            boolean no_solution = false;
            while (population.getSchedules().get(0).getFitness() != 1.0)
            {
                if(numb == 100){
                    no_solution = true;
                    break;                
                }
                ++generationNumber;
                population = geneticAlgorithm.evolve(population).sortByFitness();
                scheduleNumb = 0;
                printScheduleAsTable(population.getSchedules().get(0), generationNumber);
                classNumb = 1;
                numb++;
            }
            
            if(no_solution){
                report.setText("");
                report.setText("Sorry, no possible generation of time-table can match the venue capacity, meeting time, class capacity and other constraints you have given.");
            }
        }catch(Exception ex){
            report.setText("");
            report.setText("Erors have occured. It may be due to one of the following reasons\n     1. Their exists a course assigned to class(es) that does not have instructors.\n     2. No available venues for lectures");
        }
    }//GEN-LAST:event_generateActionPerformed

    public void printScheduleAsTable(Schedule schedule, int generation)
    {
        if (schedule.getFitness() == 1){
            ArrayList<com.genetic_algorithm_resource.Class> classes = schedule.getClasses();
            report.append("\n------- Generated Time Table -------");
            
            report.append("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            report.append("\nLecture #    |    Class    |    Course (max # number of students)    |    Venue (Capacity)    |    Instructor    |    Meeting Time\n");
            report.append("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            classes.forEach(x -> {
                int majorIndex = data.getDepts().indexOf(x.getDept());
                int coursesIndex = data.getCourses().indexOf(x.getCourse());
                int roomsIndex = data.getRooms().indexOf(x.getRoom());
                int instructorsIndex = data.getInstructors().indexOf(x.getInstructor());
                int meetingTimeIndex = data.getMeetingTimes().indexOf(x.getMeetingTime());
                report.append(String.format("\n  %1$02d  ", classNumb) + "  |  ");
                report.append(String.format("%1$4s", data.getDepts().get(majorIndex).getName()) + "  |  ");
                report.append(String.format("%1$21s", data.getCourses().get(coursesIndex).getName() + " ("+x.getCourse().getMaxNumberOfStudents()) + ")    | ");
                report.append(String.format("%1$10s", data.getRooms().get(roomsIndex).getNumber() + "(" + x.getRoom().getSeatingCapacity()) + ")      |  " );
                report.append(String.format("%1$15s", data.getInstructors().get(instructorsIndex).getName()) + "  | ");
                report.append(data.getMeetingTimes().get(meetingTimeIndex).getTime() + " (" + data.getMeetingTimes().get(meetingTimeIndex).getId() + ")");
                classNumb++;
            });
            report.append("\n\n..................................................................................");
            report.append("..................................................................................");
            report.append(".................................................................................................\n");
        }
    }
    
    int i = 0;
    private void printAvailableData()
    {
        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
        report.append("\n------ Available Lecturers ------\n\n");
        i = 0;
        data.getInstructors().forEach(x -> report.append("      "+(++i)+": " + x.getName()+"\n\n"));

        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
        report.append("\n------ Available Course ------\n\n");
        data.getCourses().forEach(x -> report.append("      Course Title: " + x.getName() + "\n      Max # of Students: " + x.getMaxNumberOfStudents() + " \n      Instructor(s): " + x.getInstructors()+"\n\n"));
        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
        
        report.append("\n------ Available Lecture Venues ------\n");
        data.getRooms().forEach(x -> report.append("      Venue Title: " + x.getNumber() + "\n      Max Seating Capacity: " + x.getSeatingCapacity()+"\n\n"));
        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
        
        report.append("\n------ Available Meeting Times ------\n");   
        i = 0;
        data.getMeetingTimes().forEach(x -> report.append("      "+(++i)+" :" + x.getTime()+"\n"));
        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
        
        report.append("\n------ Available Levels ------\n");
        data.getDepts().forEach(x -> report.append("      Class Name:  " + x.getName() + "\n      Courses Offered:  " + x.getCourses()+"\n\n"));
        
        report.append("..................................................................................");
        report.append("..................................................................................");
        report.append(".................................................................................................\n");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea report;
    // End of variables declaration//GEN-END:variables
}
