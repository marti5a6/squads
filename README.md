# Squads

### Introduction

---

Squads is a Maven-based web-app that allows for individuals to create groups (or “squads”) and communicate ideas together in one fluid chat. 

Users will have unique logins and be able to add users to their squad by username. 

Direct messaging will also be possible, as well as potentially profile customization. 

Support for image/file-sharing is also a planned endeavor. 


### Storyboard

---

![image](https://user-images.githubusercontent.com/60075541/197642378-e2e00a3c-4d96-48c7-9c70-f66df58651c5.png)


### Functional Requirements

---

As a user, I want to have a login, So that my account is unique.
- Given user connects to Squads, When user adds unique login information, Then user is logged in.

As a user, I want to have settings, So that I can customize my profile.
- Given user is logged in, When user selects “settings”, Then user can customize their profile.

As a user, I want to create groups, So that I can communicate with friends.
- Given user is logged in, When user selects “create squad”, When user inserts usernames, Then group is created with friends.

As a user, I want a chat, so that I can send/receive messages.
- Given user is logged in, When user is connected to the chat, Then user can send or receive messages (potentially images/files).
 
As a user, I want a search bar, So that I can sort messages easily.
- Given user is logged in, When user selects search, When user inserts a matching string, Then corresponding messages display. 

As a user, I want navigation, So that I can find squads.
- Given user is logged in, When user expands navigation, Then all squads are displayed.


### Class Diagram

---

![image](https://user-images.githubusercontent.com/60075541/197643076-0f0163bf-2faf-4443-83b7-39a8fefa7c48.png)


### Scrum Board

---

https://github.com/marti5a6/squads/projects


### Scrum Roles

---

Product Owner: Tony Martin

Scrum Master: Tyler Malovrh

Development Team Members: Hilbert Perez & Tigran Klekchyan


### GitHub Project Link

---

https://github.com/marti5a6/squads 
