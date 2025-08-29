package com.RatingService.repository;

import com.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating,String> {
}
