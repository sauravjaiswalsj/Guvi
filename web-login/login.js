//listen
// Your web app's Firebase configuration
  var firebaseConfig = {
    apiKey: "AIzaSyD383yEHZkQCgIHhRySN7gXRTcqsA-Ehfg",
    authDomain: "guviform.firebaseapp.com",
    databaseURL: "https://guviform.firebaseio.com",
    projectId: "guviform",
    storageBucket: "",
    messagingSenderId: "348732278769",
    appId: "1:348732278769:web:964190a7f067527c"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  var messageRef= firebase.database().ref();

/* ---login---- 

document.getElementById('forms').addEventListener('submit',submitForm);
function submitForm(e){
  e.preventDefault();
  // get values
  var email= getInputVal('user-email');
  var pass=getInputVal('user-pw');
}

function getInputVal(id){
  return document.getElementById(id).value;
}
*/
/* Registration */
document.getElementById('formsReg').addEventListener('submit',submitRegForm);

function submitRegForm(e){
  e.preventDefault();
  var name=getInputVal('name');
  var email=getInputVal('user-email');
  var pass=getInputVal('user-pw');
  var college=getInputVal('college');

  //submit form 
  saveMessage(name,email,pass,college);
  console.log('sent');
}

function saveMessage(name,email,pass,college){
  var newMessageRef= messageRef().push();
  newMessageRef.set({
    name:name,
    email:email,
    pass:pass,
    college:college,
  });
}