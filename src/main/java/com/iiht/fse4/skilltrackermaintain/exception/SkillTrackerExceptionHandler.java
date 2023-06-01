package com.iiht.fse4.skilltrackermaintain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SkillTrackerExceptionHandler {

    @ExceptionHandler( value = RatingsValueOutsideRangeException.class)
    public ResponseEntity<Object> handleRatingsValueOutsideRangeException(RatingsValueOutsideRangeException exception) {
        return new ResponseEntity<>("Data not Saved - Ratings for a Skill must be between 0 to 20", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler( value = EmptySkillsRatingException.class)
    public ResponseEntity<Object> handleAssociateNotFoundForSkillException(EmptySkillsRatingException exception) {
        return new ResponseEntity<>("Data not Saved - Empty Ratings provided for Skillset ", HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler( value = AssociateAlreadyPresentInDatabaseException.class)
    public ResponseEntity<Object> handleAssociateAlreadyPresentInDatabaseException(AssociateAlreadyPresentInDatabaseException exception) {
        return new ResponseEntity<>("Data not Saved - Associate already present in Database ", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler( value = RatingNotNumericException.class)
    public ResponseEntity<Object> handleRatingNotNumericException(RatingNotNumericException exception) {
        return new ResponseEntity<>("Data not Saved - Rating value is not Not Numeric ", HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler( value = AssociateNotPresentInDBException.class)
    public ResponseEntity<Object> handleAssociateNotPresentInDBException(AssociateNotPresentInDBException exception) {
        return new ResponseEntity<>("Data not Updated - AssociateID not present in DB", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler( value = CredentialsMismatchException.class)
    public ResponseEntity<Object> handleCredentialsMismatchException(CredentialsMismatchException exception) {
        return new ResponseEntity<>("Provided Credentials Do Not Match", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler( value = RecordUpdationNotAllowedInDatabaseException.class)
    public ResponseEntity<Object> handleRecordUpdationNotAllowedInDatabaseException(RecordUpdationNotAllowedInDatabaseException exception) {
        return new ResponseEntity<>("Data not Updated - Record is less than 10 days old", HttpStatus.NOT_FOUND);
    }














}
