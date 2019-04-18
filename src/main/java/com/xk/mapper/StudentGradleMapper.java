package com.xk.mapper;

import com.xk.dao.StudentGradle;
import com.xk.dao.StudentGradleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StudentGradleMapper {
    @SelectProvider(type=StudentGradleSqlProvider.class, method="countByExample")
    int countByExample(StudentGradleExample example);

    @DeleteProvider(type=StudentGradleSqlProvider.class, method="deleteByExample")
    int deleteByExample(StudentGradleExample example);

    @Delete({
        "delete from student_gradle",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into student_gradle (id, student_name, ",
        "student_id, coursen_name, ",
        "coursen_id, grade)",
        "values (#{id,jdbcType=INTEGER}, #{studentName,jdbcType=VARCHAR}, ",
        "#{studentId,jdbcType=INTEGER}, #{coursenName,jdbcType=VARCHAR}, ",
        "#{coursenId,jdbcType=INTEGER}, #{grade,jdbcType=DECIMAL})"
    })
    int insert(StudentGradle record);

    @InsertProvider(type=StudentGradleSqlProvider.class, method="insertSelective")
    int insertSelective(StudentGradle record);

    @SelectProvider(type=StudentGradleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="student_name", property="studentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="student_id", property="studentId", jdbcType=JdbcType.INTEGER),
        @Result(column="coursen_name", property="coursenName", jdbcType=JdbcType.VARCHAR),
        @Result(column="coursen_id", property="coursenId", jdbcType=JdbcType.INTEGER),
        @Result(column="grade", property="grade", jdbcType=JdbcType.DECIMAL)
    })
    List<StudentGradle> selectByExample(StudentGradleExample example);

    @Select({
        "select",
        "id, student_name, student_id, coursen_name, coursen_id, grade",
        "from student_gradle",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="student_name", property="studentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="student_id", property="studentId", jdbcType=JdbcType.INTEGER),
        @Result(column="coursen_name", property="coursenName", jdbcType=JdbcType.VARCHAR),
        @Result(column="coursen_id", property="coursenId", jdbcType=JdbcType.INTEGER),
        @Result(column="grade", property="grade", jdbcType=JdbcType.DECIMAL)
    })
    StudentGradle selectByPrimaryKey(Integer id);

    @UpdateProvider(type=StudentGradleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StudentGradle record, @Param("example") StudentGradleExample example);

    @UpdateProvider(type=StudentGradleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StudentGradle record, @Param("example") StudentGradleExample example);

    @UpdateProvider(type=StudentGradleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StudentGradle record);

    @Update({
        "update student_gradle",
        "set student_name = #{studentName,jdbcType=VARCHAR},",
          "student_id = #{studentId,jdbcType=INTEGER},",
          "coursen_name = #{coursenName,jdbcType=VARCHAR},",
          "coursen_id = #{coursenId,jdbcType=INTEGER},",
          "grade = #{grade,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StudentGradle record);
}