package com.ictech.code;

import javax.swing.*;

public class Admin {
    private JPanel Adminpanel;
    private JTextField txtAdminname;
    private JTabbedPane tbbAdminPane;
    private JPanel tbbAdminProfile;
    private JLabel lbladidprfl;
    private JLabel lblfnprfl;
    private JLabel lblconprfl;
    private JTextField txtadidprfl;
    private JTextField txtfnprfl;
    private JTextField txtconprfl;
    private JLabel lbllnprfl;
    private JTextField txtlnprfl;
    private JButton btnSearchPrfl;
    private JButton updateDetailsButton;
    private JPanel tbbmaintainCources;
    private JLabel lblCC;
    private JLabel lblCName;
    private JLabel lblAdid;
    private JLabel lblLecid;
    private JButton btnAddCourse;
    private JButton btnUpdateCourse;
    private JButton btnDeleteCourse;
    private JTextField txtCName;
    private JTextField txtAdid;
    private JTextField txtCC;
    private JButton btnSearchCourse;
    private JTextField txtLecid;
    private JTable table6;
    private JPanel tbbmaintainUP;
    private JTabbedPane tabbedPane1;
    private JPanel stdPanel;
    private JLabel lblstdid;
    private JTextField txtstdid;
    private JLabel lblfname;
    private JLabel lbllname;
    private JLabel lbldob;
    private JLabel lblphn;
    private JLabel lblemail;
    private JLabel lblgender;
    private JLabel lblpw;
    private JTextField txtfname;
    private JTextField txtlname;
    private JTextField txtdob;
    private JTextField txtphn;
    private JTextField txtemail;
    private JComboBox txtgender;
    private JPasswordField txtpw;
    private JTable table1;
    private JButton btngetdetails;
    private JButton btndelete;
    private JButton btnupdate;
    private JButton btnregister;
    private JPanel lecturepanel;
    private JLabel lbllecid;
    private JLabel lblfnameL;
    private JLabel lbllnameL;
    private JLabel lbldobL;
    private JLabel lblphnL;
    private JLabel lblemailL;
    private JLabel lblgenderL;
    private JLabel lblpwL;
    private JTextField txtlecid;
    private JTextField txtfnameL;
    private JTextField txtlnameL;
    private JTextField txtphnL;
    private JTextField txtemailL;
    private JPasswordField txtpwL;
    private JComboBox txtgenderL;
    private JTextField txtdobL;
    private JLabel lblUnameL;
    private JTextField txtUnameL;
    private JTable table2;
    private JButton btngetdetailsL;
    private JButton btndeleteL;
    private JButton btnupdateL;
    private JButton btnregisterL;
    private JPanel AdminPanel;
    private JLabel lbladmid;
    private JLabel lblfnameA;
    private JLabel lbllnameA;
    private JLabel lbldobA;
    private JLabel lblphnA;
    private JLabel lblemailA;
    private JLabel lblgenderA;
    private JLabel lblpwA;
    private JTextField txtadmid;
    private JTextField txtfnameA;
    private JTextField txtlnameA;
    private JTextField txtdobA;
    private JTextField txtphnA;
    private JTextField txtemailA;
    private JComboBox txtgenderA;
    private JPasswordField txtpwA;
    private JTable table3;
    private JButton btngdetailsA;
    private JButton btndeleteA;
    private JButton btnupdateA;
    private JButton btnregistreA;
    private JPanel TOPanel;
    private JLabel lblfnT;
    private JLabel lbllnT;
    private JLabel lbldobT;
    private JLabel lblphnT;
    private JLabel lblemT;
    private JLabel lblgenT;
    private JLabel lblpwT;
    private JLabel lbltoid;
    private JTextField txttoid;
    private JTextField txtfnT;
    private JTextField txtlnT;
    private JTextField txtdobT;
    private JTextField txtphnT;
    private JTextField txtemT;
    private JComboBox txtgenT;
    private JPasswordField txtpwT;
    private JTable table4;
    private JButton btngdetailsT;
    private JButton btndelT;
    private JButton btnupdT;
    private JButton btnregT;
    private JPanel tbbmaintainNotices;
    private JLabel lblNoticeno;
    private JLabel lblnoticedate;
    private JLabel lblnoticedetails;
    private JLabel lblNoticeDescription;
    private JTextField txtnoticeno;
    private JTextField txtnoticedate;
    private JTextField txtnoticedetrails;
    private JButton getInfoButton;
    private JButton btndeletenotice;
    private JButton btnupdatenotice;
    private JButton btnaddnotice;
    private JLabel lbladmNOT;
    private JTextField txtadmNOT;
    private JTable table5;
    private JTextArea txtAreaNotice;
    private JPanel lblL4S2;
    private JLabel lbl_tm_L1S1_ICT;
    private JTextField txt_tm_L1S1_ICT;
    private JButton btnSearch_ICT_L1S1;
    private JButton btnICT_L1S1_add;
    private JButton btn_Update_l1s1_ICT;
    private JButton btn_Delete_l1s1_ICT;
    private JTextField txt_L1S1_ICT_mon;
    private JTextField txt_L1S1_ICT_tue;
    private JTextField txt_L1S1_ICT_wed;
    private JTextField txt_L1S1_ICT_fri;
    private JTextField txt_L1S1_ICT_thu;
    private JLabel lbl_tm_L1S1_et;
    private JTextField txt_tm_L1S1_et;
    private JButton btnSearch_et_L1S1;
    private JButton btnET_L1S1_add;
    private JButton btn_Update_l1s1_ET;
    private JButton btn_Delete_l1s1_ET;
    private JLabel lbl_L1S1_ET_mon;
    private JTextField txt_L1S1_ET_tue;
    private JTextField txt_L1S1_ET_wed;
    private JTextField txt_L1S1_ET_thu;
    private JTextField txt_L1S1_ET_fri;
    private JTextField txt_L1S1_ET_mon;
    private JTable tbl_ict_l1s1;
    private JTable tbl_et_l1s1;
    private JLabel lbl_tm_L1S1_bst;
    private JTextField txt_tm_L1S1_bst;
    private JButton btnSearch_bst_L1S1;
    private JLabel lbl_L1S1_BST_mon;
    private JTextField txt_L1S1_BST_mon;
    private JLabel lbl_L1S1_BST_tue;
    private JTextField txt_L1S1_BST_wed;
    private JLabel lbl_L1S1_BST_wed;
    private JTextField txt_L1S1_BST_tue;
    private JLabel lbl_L1S1_BST_thu;
    private JTextField txt_L1S1_BST_thu;
    private JLabel lbl_L1S1_BST_fri;
    private JTextField txt_L1S1_BST_fri;
    private JButton btn_Delete_l1s1_bst;
    private JButton btn_Update_l1s1_bst;
    private JButton btnBST_L1S1_add;
    private JTable tbl_bst_l1s1;
    private JTextField txt_tm_L1S2_bst;
    private JButton btnSearch_bst_L1S2;
    private JButton btnBST_L1S2_add;
    private JButton btn_Update_l1s2_bst;
    private JButton btn_Delete_l1s2_bst;
    private JTextField txt_L1S2_BST_mon;
    private JTextField txt_L1S2_BST_tue;
    private JTextField txt_L1S2_BST_wed;
    private JTextField txt_L1S2_BST_thu;
    private JTextField txt_L1S2_BST_fri;
    private JTable tbl_bst_l1s2;
    private JTextField txt_tm_L1S2_ICT;
    private JTextField txt_L1S2_ICT_mon;
    private JTextField txt_L1S2_ICT_thu;
    private JTextField txt_L1S2_ICT_tue;
    private JTextField txt_L1S2_ICT_fri;
    private JButton btnICT_L1S2_add;
    private JButton btnSearch_ICT_L1S2;
    private JButton btn_Update_l1s2_ICT;
    private JButton btn_Delete_l1s2_ICT;
    private JTextField txt_L1S2_ICT_wed;
    private JTable tbl_ict_l1s2;
    private JTextField txt_tm_L1S2_et;
    private JTextField txt_L1S2_ET_mon;
    private JTextField txt_L1S2_ET_thu;
    private JTextField txt_L1S2_ET_tue;
    private JTextField txt_L1S2_ET_fri;
    private JTextField txt_L1S2_ET_wed;
    private JButton btnSearch_et_L1S2;
    private JButton btnET_L1S2_add;
    private JButton btn_Update_l1s2_ET;
    private JButton btn_Delete_l1s2_ET;
    private JTable tbl_et_l1s2;
    private JTextField txt_tm_L2S1_bst;
    private JTextField txt_L2S1_BST_tue;
    private JTextField txt_L2S1_BST_fri;
    private JTextField txt_L2S1_BST_thu;
    private JTextField txt_L2S1_BST_mon;
    private JTextField txt_L2S1_BST_wed;
    private JButton btnSearch_bst_L2S1;
    private JButton btn_Update_l2s1_bst;
    private JButton btn_Delete_l2s1_bst;
    private JButton btnBST_L2S1_add;
    private JTable tbl_bst_l2s1;
    private JTextField txt_tm_L2S1_ICT;
    private JTextField txt_L2S1_ICT_mon;
    private JTextField txt_L2S1_ICT_thu;
    private JTextField txt_L2S1_ICT_tue;
    private JTextField txt_L2S1_ICT_fri;
    private JTextField txt_L2S1_ICT_wed;
    private JButton btnSearch_ICT_L2S1;
    private JButton btnICT_L2S1_add;
    private JButton btn_Update_l2s1_ICT;
    private JButton btn_Delete_l2s1_ICT;
    private JTable tbl_ict_l2s1;
    private JTextField txt_tm_L2S1_ET;
    private JTextField txt_L2S1_ET_mon;
    private JTextField txt_L2S1_ET_thu;
    private JTextField txt_L2S1_ET_tue;
    private JTextField txt_L2S1_ET_fri;
    private JTextField txt_L2S1_ET_wed;
    private JButton btn_Delete_l2s1_ET;
    private JButton btn_Update_l2s1_ET;
    private JButton btnET_L2S1_add;
    private JButton btnSearch_et_L2S1;
    private JTable tbl_et_l2s1;
    private JTextField txt_tm_L2S2_bst;
    private JTextField txt_L2S2_BST_mon;
    private JTextField txt_L2S2_BST_thu;
    private JTextField txt_L2S2_BST_tue;
    private JTextField txt_L2S2_BST_fri;
    private JTextField txt_L2S2_BST_wed;
    private JButton btnSearch_bst_L2S2;
    private JButton btn_Update_l2s2_bst;
    private JButton btn_Delete_l2s2_bst;
    private JButton btnBST_L2S2_add;
    private JTable tbl_bst_l2s2;
    private JButton btnSearch_ICT_L2S2;
    private JTextField txt_tm_L2S2_ICT;
    private JTextField txt_L2S2_ICT_mon;
    private JTextField txt_L2S2_ICT_thu;
    private JTextField txt_L2S2_ICT_tue;
    private JTextField txt_L2S2_ICT_fri;
    private JTextField txt_L2S2_ICT_wed;
    private JButton btnICT_L2S2_add;
    private JButton btn_Update_l2s2_ICT;
    private JButton btn_Delete_l2s2_ICT;
    private JTable tbl_ict_l2s2;
    private JTextField txt_tm_L2S2_et;
    private JTextField txt_L2S2_ET_mon;
    private JTextField txt_L2S2_ET_thu;
    private JButton btnSearch_et_L2S2;
    private JButton btnET_L2S2_add;
    private JButton btn_Update_l2s2_ET;
    private JButton btn_Delete_l2s2_ET;
    private JTextField txt_L2S2_ET_tue;
    private JTextField txt_L2S2_ET_fri;
    private JTextField txt_L2S2_ET_wed;
    private JTable tbl_et_l2s2;
    private JTextField txt_tm_L3S1_bst;
    private JTextField txt_L3S1_BST_mon;
    private JTextField txt_L3S1_BST_thu;
    private JTextField txt_L3S1_BST_tue;
    private JTextField txt_L3S1_BST_fri;
    private JTextField txt_L3S1_BST_wed;
    private JButton btnSearch_bst_L3S1;
    private JButton btnBST_L3S1_add;
    private JButton btn_Update_l3s1_bst;
    private JButton btn_Delete_l3s1_bst;
    private JTable tbl_bst_l3s1;
    private JTextField txt_tm_L3S1_ICT;
    private JTextField txt_L3S1_ICT_mon;
    private JTextField txt_L3S1_ICT_thu;
    private JTextField txt_L3S1_ICT_tue;
    private JTextField txt_L3S1_ICT_fri;
    private JTextField txt_L3S1_ICT_wed;
    private JButton btnSearch_ICT_L3S1;
    private JButton btnICT_L3S1_add;
    private JButton btn_Update_l3s1_ICT;
    private JButton btn_Delete_l3s1_ICT;
    private JTextField txt_tm_L3S1_ET;
    private JTextField txt_L3S1_ET_mon;
    private JTextField txt_L3S1_ET_thu;
    private JTextField txt_L3S1_ET_tue;
    private JTextField txt_L3S1_ET_fri;
    private JTextField txt_L3S1_ET_wed;
    private JButton btnSearch_et_L3S1;
    private JButton btnET_L3S1_add;
    private JButton btn_Update_l3s1_ET;
    private JButton btn_Delete_l3s1_ET;
    private JTable tbl_ict_l3s1;
    private JTable tbl_et_l3s1;
    private JTextField txt_tm_L3S2_bst;
    private JTextField txt_L3S2_BST_mon;
    private JTextField txt_L3S2_BST_thu;
    private JTextField txt_L3S2_BST_tue;
    private JTextField txt_L3S2_BST_fri;
    private JTextField txt_L3S2_BST_wed;
    private JButton btnSearch_bst_L3S2;
    private JButton btnBST_L3S2_add;
    private JButton btn_Update_l3s2_bst;
    private JButton btn_Delete_l3s2_bst;
    private JTextField txt_L3S2_ICT_tue;
    private JTextField txt_L3S2_ICT_fri;
    private JTextField txt_L3S2_ICT_mon;
    private JTextField txt_tm_L3S2_ICT;
    private JTextField txt_L3S2_ICT_thu;
    private JTextField txt_L3S2_ICT_wed;
    private JButton btn_Update_l3s2_ICT;
    private JButton btnICT_L3S2_add;
    private JButton btnSearch_ICT_L3S2;
    private JButton btn_Delete_l3s2_ICT;
    private JTextField txt_tm_L3S2_ET;
    private JTextField txt_L3S2_ET_mon;
    private JTextField txt_L3S2_ET_thu;
    private JTextField txt_L3S2_ET_tue;
    private JTextField txt_L3S2_ET_fri;
    private JTextField txt_L3S2_ET_wed;
    private JButton btn_Update_l3s2_ET;
    private JButton btn_Delete_l3s2_ET;
    private JButton btnET_L3S2_add;
    private JButton btnSearch_et_L3S2;
    private JTable tbl_bst_l3s2;
    private JTable tbl_ict_l3s2;
    private JTable tbl_et_l3s2;
    private JTextField txt_tm_L4S1_bst;
    private JTextField txt_L4S1_BST_mon;
    private JTextField txt_L4S1_BST_thu;
    private JButton btnSearch_bst_L4S1;
    private JButton btnBST_L4S1_add;
    private JTextField txt_L4S1_BST_tue;
    private JTextField txt_L4S1_BST_fri;
    private JButton btn_Update_l4s1_bst;
    private JButton btn_Delete_l4s1_bst;
    private JTextField txt_L4S1_BST_wed;
    private JTextField txt_tm_L4S1_ICT;
    private JTextField txt_L4S1_ICT_mon;
    private JTextField txt_L4S1_ICT_thu;
    private JTextField txt_L4S1_ICT_tue;
    private JTextField txt_L4S1_ICT_fri;
    private JTextField txt_L4S1_ICT_wed;
    private JButton btnSearch_ICT_L4S1;
    private JButton btnICT_L4S1_add;
    private JButton btn_Update_l4s1_ICT;
    private JButton btn_Delete_l4s1_ICT;
    private JTextField txt_tm_L4S1_ET;
    private JTextField txt_L4S1_ET_mon;
    private JTextField txt_L4S1_ET_thu;
    private JTextField txt_L4S1_ET_tue;
    private JTextField txt_L4S1_ET_fri;
    private JTextField txt_L4S1_ET_wed;
    private JButton btn_Update_l4s1_ET;
    private JButton btnET_L4S1_add;
    private JButton btnSearch_et_L4S1;
    private JTable tbl_bst_l4s1;
    private JTable tbl_ict_l4s1;
    private JTable tbl_et_l4s1;
    private JButton btn_Delete_l4s1_ET;
    private JTextField txt_tm_L4S2_bst;
    private JTextField txt_L4S2_BST_mon;
    private JTextField txt_L4S2_BST_thu;
    private JTextField txt_L4S2_BST_tue;
    private JTextField txt_L4S2_BST_wed;
    private JButton btnSearch_bst_L4S2;
    private JButton btnBST_L4S2_add;
    private JButton btn_Update_l4s2_bst;
    private JButton btn_Delete_l4s2_bst;
    private JTextField txt_L4S2_BST_fri;
    private JTextField txt_tm_L4S2_ICT;
    private JTextField txt_L4S2_ICT_mon;
    private JTextField txt_L4S2_ICT_thu;
    private JTextField txt_L4S2_ICT_tue;
    private JTextField txt_L4S2_ICT_fri;
    private JTextField txt_L4S2_ICT_wed;
    private JButton btn_Delete_l4s2_ICT;
    private JButton btn_Update_l4s2_ICT;
    private JButton btnICT_L4S2_add;
    private JButton btnSearch_ICT_L4S2;
    private JTextField txt_tm_L4S2_ET;
    private JTextField txt_L4S2_ET_mon;
    private JTextField txt_L4S2_ET_thu;
    private JTextField txt_L4S2_ET_tue;
    private JTextField txt_L4S2_ET_fri;
    private JTextField txt_L4S2_ET_wed;
    private JButton btn_Update_l4s2_ET;
    private JButton btn_Delete_l4s2_ET;
    private JButton btnET_L4S2_add;
    private JButton btnSearch_et_L4S2;
    private JTable tbl_bst_l4s2;
    private JTable tbl_ict_l4s2;
    private JTable tbl_et_l4s2;
    private JTable tbl_Notice;
    private JLabel lblgrp7;
}
