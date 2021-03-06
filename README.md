# LongestPalindromicSubstringRESTAPI

This is a REST API written in Java, using Spring Boot.
This application takes in a string as input and stores it in the storage. it offers a few REST methods.

## How to start the application:
clone the repository onto machine and simply run java file PalindromeApiApplication.java as java application.

## REST API
The REST API to the application is described below:

## Save the input String:
# Request:
GET /saveString

http://localhost:8080/saveString
request body: 
{
 "id": "babad"
}

# Response
Input String saved

## Get Longest Palindromic substring:
# Request:
GET /getLongestPalidrome/{input_string}

http://localhost:8080/input/babad

# Response
bab

## Get list of all strings and their palindromic substrings:
# Request:
GET /getAllStrings

http://localhost:8080/getAllStrings

# Response
[
    {
        "longestPalindrome": "bab",
        "id": "babad"
    },
    {
        "longestPalindrome": "baxabaxab",
        "id": "abaxabaxabb"
    }
]

Swagger ui console for the REST-API can be accessed at http://localhost:8080/swagger-ui.html#/
