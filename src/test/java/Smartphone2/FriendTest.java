package Smartphone2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {

    @Test
    void FriendObjectInstatiation_withNameAsStringAndNumber_TestName() {
        //Given
        Friend testFriend = new Friend("Test Name", -1);
        //When
        String actual = testFriend.name;
        //Then
        Assertions.assertEquals("Test Name", actual);
    }

    @Test
    void FriendObjectInstatiation_withNameAsStringAndNumber_TestNumber() {
        //Given
        Friend testFriend = new Friend("Test Name", -1);
        //When
        int actual = testFriend.num;
        //Then
        Assertions.assertEquals(-1, actual);
    }

    @Test
    void FriendObjectInstatiation_getNameMethodReturnsNameAsString() {
        //Given
        Friend testFriend = new Friend("Test Name", -1);
        //When
        String actual = testFriend.getName();
        //Then
        Assertions.assertEquals("Test Name", actual);
    }

    @Test
    void FriendObjectInstatiation_getNumMethodReturnsNumberAsInt() {
        //Given
        Friend testFriend = new Friend("Test Name", -1);
        //When
        int actual = testFriend.getNum();
        //Then
        Assertions.assertEquals(-1, actual);
    }

}