package com.community.mapper;

import com.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * QuestionMapper class
 *
 * @author: Administrator
 * @date: 2019/9/9 11:14
 * Description:
 */
@Mapper
public interface QuestionMapper {

    @Insert("INSERT INTO question (title, description, gmt_create, gmt_modified, tag, creator) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{tag},#{creator})")
    void create(Question question);

    @Select("Select * from question")
    List<Question> list();
}