####Story 3

```
As a Bank Manager
 I would like customers to receive a welcome message when being added
 So that they feel like we are engaged with them

```

Notes:

* You must use the Bank’s Message Gateway API (provided)

Acceptance Criteria:

* A message is sent to the customer who was added to the bank
* The message is addressed to the customer’s email address – the form is: nickname@thebank.com
* The message content is “Dear <nickname>, Welcome to the Bank”

#####TODO-List

1. the Bank's Message Gateway API doesn't exist, so we need a stub.
2. should display welcome message after added customer by the Bank's Message Gateway API.

#####Required Tech

1. Mock vs Stub

#####Check

1. email content should be isolate as a template service.