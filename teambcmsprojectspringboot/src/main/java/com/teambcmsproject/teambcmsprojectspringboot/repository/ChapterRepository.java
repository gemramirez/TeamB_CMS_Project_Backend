package com.teambcmsproject.teambcmsprojectspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teambcmsproject.teambcmsprojectspringboot.model.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long>  {

  
}
