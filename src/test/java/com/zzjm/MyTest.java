package com.zzjm;

import com.zzjm.Utils.MyUtil;
import com.zzjm.dao.StudentDao;
import com.zzjm.domain.MyStudent;
import com.zzjm.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zzjm.vo.ViewStudent;

import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void SelectStudentbyid(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Student student=studentDao.SelectStudent(1001);
        System.out.println(student);
        sqlSession.close();
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
        sqlSession.close();
    }
    @Test
    public void SelectStudentViewStudentTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<ViewStudent> viewStudentList=studentDao.SelectStudentViewStudent(1009);
        for (ViewStudent viewStudent:viewStudentList){
            System.out.println("1001数据"+viewStudent);
        }
        sqlSession.close();
    }
    @Test
    public void StudentCountTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        int count=studentDao.Studentcount();
        System.out.println("学生数量"+count);
        sqlSession.close();
    }
    @Test
    public void selectStudentMapTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        Map<Object,Object> map=studentDao.selectStudentbyid(1001);
        System.out.println("map="+map);
        sqlSession.close();
    }
    //resultMap的使用
    @Test
    public void selectStudentResultMapTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> StudentList=studentDao.selectStudentResultMap();
        for (Student student:StudentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void selectMyStudentResultMapTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
       List<MyStudent> myStudentList=studentDao.selectMyStudentResultMap();
       for (MyStudent myStudent:myStudentList){
           System.out.println("学生"+myStudent);
       }
        sqlSession.close();
    }
    @Test
    public void selectMyStudentTest(){
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<MyStudent> myStudentList=studentDao.selectMyStudentResultMap2();
        for (MyStudent myStudent:myStudentList){
            System.out.println("学生2"+myStudent);
        }
        sqlSession.close();
    }
    @Test
    public void selectStudentLikeOneTest(){
        String name="%李%";
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> myStudentList=studentDao.StudentStudentLikeOne(name);
        for (Student student:myStudentList){
            System.out.println("学"+student);
        }
        sqlSession.close();
    }
    @Test
    public void selectStudentLikeTwoTest(){
        String name="李";
        SqlSession sqlSession=MyUtil.getSqlsession();
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> myStudentList=studentDao.StudentStudentLikeTwo(name);
        for (Student student:myStudentList){
            System.out.println("学"+student);
        }
        sqlSession.close();
    }
}
