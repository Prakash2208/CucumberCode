Feature: Automating Contact Page in the DemoBlaze Website
Background:

Given Launch the Browser and open the Url

Scenario: Fill Contact mail with number and send message

When Need to Locate Contact Menu, Name with number and message fields to send

And In the Contact Mail Field  type "vp22081998@gmaill.com"

And In the Contact Number Field  type "8610368086"

And In the Message Filed type the message to send

And Click the Send Message Button to send the message

Then Message is sent successfully and the alert is closed

