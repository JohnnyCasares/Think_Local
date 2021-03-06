Group 3 Original App Design Project - README Template 
===

# Service Social

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
The objective of the Service Social app is to connect local businesses and their customers easily. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category: Business**
- **Mobile: This application will be primarily mobile.**
- **Story: Home feed, User/Buisness Profile, Search/Search Filter, Business Post**
- **Market: This app will be for any users trying to explore and for businesses to advertise.**
- **Habit: A user would use the application on average 4-5 times a month.**
- **Scope: The app allows the users to search for local businesses.**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User can login as either a customer or business 
* Allows freelancers and businnesses to connect to customers 
* Search feature to check out recommendations
* User profile
* Business owners can post advertisment
* Buisness profile 
* ...

**Optional Nice-to-have Stories**

* Implement voice assistant
* Rating, reviewing, ranking
* Customers can reach out for a service such as scheduling appointments.
* Search filters
* Direct messanger icon
* ...

### 2. Screen Archetypes

* Login
   * User logs in 
* Register
   * User creates an account
   * ...
* Home Feed
   * User will be able to view their personal recommendations
   * Filter based on the location of the user
   * Businesses will be able to view their own listings

* Creation/ Compose/ Post
    * User can post about its business with a pic and text

* Profile
   * Username or name of the company
   * Description, content by the user.

* Search
    * User can look up businesses that are registered in app and view their profile content.



### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home Feed 
* User/Buisness Profile
* Search/Search Filter
* Business post


**Flow Navigation** (Screen to Screen)

* Login
   * Stream
   * ...
* Register - user registers and logs into account
   * Stream
* Stream - User can scroll thorugh the main feed and check out recommendations
    * Posts
    * Profiles from accounts that populate the stream
* Post - User can create a post about their business or service that they are seeking.
    * stream
* Profile
    * Content created by the user
    * description and name of user

* Search
    * Populated with local businesses registred in the app 
   
   
<img src='wireframe.png' title='APP Wireframe' width='' alt='Video Walkthrough' />

## Schema 
### Models
#### Post

   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | objectId      | String   | unique id for the user post (default field) |
   | author        | Pointer to User| image author |
   | image         | File     | image that user posts |
   | caption       | String   | image caption by author |
   
#### User (customer || Business)
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | userName       | String   | unique user identifier |
   | image         | File     | image that user posts |
   | Bio       | String   | image caption by author |
   | Location       | String   | The location of the business only if the user is a business else if the user is a customer fill with default value|
   
   #### Following
   | Property      | Type     | Description |
   | ------------- | -------- | ------------|
   | userName       | String   | unique identifier of the user following |
   | UserName         | String     | unique identifier of the user being followed |
   
