package com.by.test;

import com.by.bean.DeptAndEmp;
import com.by.dao.DeptAndEmpDaoImp;

import java.util.List;
import java.util.Scanner;

public class DeptAndEmpTest {

    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {

        DeptAndEmpDaoImp dae = new DeptAndEmpDaoImp();

        while(true){

            System.out.println("选择功能：1.删除  2.添加  3.查询  4.退出");
            int key = sr.nextInt();

            switch (key){

                //③测试类代码正确（根据删除方法返回值判断删除是否成功进而给出提示）
                case 1:{

                    DeptAndEmp deptAndEmp = new DeptAndEmp(1, null, 0, null, 0, null, 0);

                    int i = dae.delId(deptAndEmp);

                    if (i>0){
                        System.out.println("删除成功！");
                    }else {
                        System.out.println("删除失败！");
                    }

                    break;
                }

                case 2:{

                    //③dao中增加方法编写正确（增加方法参数为员工对象，有返回值类型自拟）（
                    DeptAndEmp deptAndEmp = new DeptAndEmp(0, null, 0, "比克", 35, "男", 2);

                    int insert = dae.insert(deptAndEmp);

                    if (insert>0){
                        System.out.println("添加成功！");
                    }else {
                        System.out.println("添加失败！");
                    }

                    break;
                }

                case 3:{
                    //③测试类代码编写正确（调用dao中查询方法，遍历返回值输出信息）
                    System.out.println("请输入部门名：");
                    String dname = sr.next();

                    DeptAndEmp deptAndEmp = new DeptAndEmp(0, dname, 0, null, 0, null, 0);

                    if (deptAndEmp.getDname().equals(dname)){
                        System.out.println("该部门下的员工有：");
                        List<DeptAndEmp> id = dae.findId(deptAndEmp);
                        for (DeptAndEmp andEmp : id) {

                            System.out.println("员工ID:"+andEmp.getEmpid()+"    姓名："+andEmp.getEname()+"    性别："+andEmp.getEgendar()+"    年龄："+andEmp.getEage()+"    部门ID:"+andEmp.getDeptid());

                        }
                    }

                    break;
                }

                case 4:{

                    System.out.println("感谢使用，再见！");
                    System.exit(0);

                    break;
                }

                default:{

                    System.out.println("输入错误，请重新输入！");

                    break;
                }

            }


        }


    }
}
