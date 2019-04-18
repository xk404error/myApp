package com.xk.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.xk.dao.StudentGradle;
import com.xk.dao.StudentGradleExample.Criteria;
import com.xk.dao.StudentGradleExample.Criterion;
import com.xk.dao.StudentGradleExample;
import java.util.List;
import java.util.Map;

public class StudentGradleSqlProvider {

    public String countByExample(StudentGradleExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("student_gradle");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(StudentGradleExample example) {
        BEGIN();
        DELETE_FROM("student_gradle");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(StudentGradle record) {
        BEGIN();
        INSERT_INTO("student_gradle");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getStudentName() != null) {
            VALUES("student_name", "#{studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentId() != null) {
            VALUES("student_id", "#{studentId,jdbcType=INTEGER}");
        }
        
        if (record.getCoursenName() != null) {
            VALUES("coursen_name", "#{coursenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursenId() != null) {
            VALUES("coursen_id", "#{coursenId,jdbcType=INTEGER}");
        }
        
        if (record.getGrade() != null) {
            VALUES("grade", "#{grade,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String selectByExample(StudentGradleExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("student_name");
        SELECT("student_id");
        SELECT("coursen_name");
        SELECT("coursen_id");
        SELECT("grade");
        FROM("student_gradle");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        StudentGradle record = (StudentGradle) parameter.get("record");
        StudentGradleExample example = (StudentGradleExample) parameter.get("example");
        
        BEGIN();
        UPDATE("student_gradle");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getStudentName() != null) {
            SET("student_name = #{record.studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentId() != null) {
            SET("student_id = #{record.studentId,jdbcType=INTEGER}");
        }
        
        if (record.getCoursenName() != null) {
            SET("coursen_name = #{record.coursenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursenId() != null) {
            SET("coursen_id = #{record.coursenId,jdbcType=INTEGER}");
        }
        
        if (record.getGrade() != null) {
            SET("grade = #{record.grade,jdbcType=DECIMAL}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("student_gradle");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("student_name = #{record.studentName,jdbcType=VARCHAR}");
        SET("student_id = #{record.studentId,jdbcType=INTEGER}");
        SET("coursen_name = #{record.coursenName,jdbcType=VARCHAR}");
        SET("coursen_id = #{record.coursenId,jdbcType=INTEGER}");
        SET("grade = #{record.grade,jdbcType=DECIMAL}");
        
        StudentGradleExample example = (StudentGradleExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(StudentGradle record) {
        BEGIN();
        UPDATE("student_gradle");
        
        if (record.getStudentName() != null) {
            SET("student_name = #{studentName,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentId() != null) {
            SET("student_id = #{studentId,jdbcType=INTEGER}");
        }
        
        if (record.getCoursenName() != null) {
            SET("coursen_name = #{coursenName,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursenId() != null) {
            SET("coursen_id = #{coursenId,jdbcType=INTEGER}");
        }
        
        if (record.getGrade() != null) {
            SET("grade = #{grade,jdbcType=DECIMAL}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(StudentGradleExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}