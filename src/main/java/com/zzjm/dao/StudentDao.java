package com.zzjm.dao;

import com.zzjm.domain.Student;
import org.apache.ibatis.annotations.Param;
import com.zzjm.vo.ViewStudent;

import java.util.List;

public interface StudentDao {
    Student SelectStudent(@Param("id") int id);
    List<Student> SelectStudentList(@Param("Sid") int id,@Param("Sname") String name);
    List<ViewStudent> SelectStudentViewStudent(@Param("sid") int id);
    int Studentcount();
}
