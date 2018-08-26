Steps to setup papertrail

1. Log on to http://papertrailapp.com/
2. Create logging group in papetrail dashboard ("Create Group" button). 
3. Create log destination in papertrail dashboard. 
4. Go to "Account -> Log destinations"
5. Click "Create log destination" button.
6. Make sure your group is selected in "New systems will join" field.
7. You can leave all others fields with their default values, just click "Create".
8. Remember your log destination (will looks like logs2.papertrailapp:12345)
9. Make the changes in the pom.xml to drain to the papertrail location.