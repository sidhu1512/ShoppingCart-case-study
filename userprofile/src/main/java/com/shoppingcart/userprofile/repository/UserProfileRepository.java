package com.shoppingcart.userprofile.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shoppingcart.userprofile.model.UserProfileDTO;

public interface UserProfileRepository extends MongoRepository<UserProfileDTO, String> 
{
	UserProfileDTO findAllByMobileNumber(Long mobileNumber);
	UserProfileDTO findByfullName(String fullName);
	
}
