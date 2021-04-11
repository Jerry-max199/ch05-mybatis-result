package com.zzjm;

import com.zzjm.Utils.MyUtil;
import com.zzjm.dao.StudentDao;
import com.zzjm.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zzjm.vo.ViewStudent;

import java.util.List;

public class MyTest {
    @Test
    public void SelectStudentbyid(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Student student=studentDao.SelectStudent(1001);
        System.out.println(student);
   }
   //别名的使用
    @Test
    public void SelectStudentListTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> studentList=studentDao.SelectStudentList(1001,"张三");
        for (Student student:studentList){
            System.out.println("1001数据"+studentList);
        }
    }
    @Test
    public void SelectStudentViewStudentTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<ViewStudent> viewStudentList=studentDao.SelectStudentViewStudent(1009);
        for (ViewStudent viewStudent:viewStudentList){
            System.out.println("1001数据"+viewStudentList);
        }
    }
    @Test
    public void StudentCountTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        int count=studentDao.Studentcount();
        System.out.println("学生数量"+count);
    }
}
