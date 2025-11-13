const registerButton = document.getElementById('Register');
const nameField = document.getElementById('name');
const emailField = document.getElementById('email');
const passwordField = document.getElementById('password');
const confirmPasswordField = document.getElementById('passwordretype');
const registerForm = document.getElementById('registerform');
const buyerCheckbox = document.getElementById('buyer');
const sellerCheckbox = document.getElementById('seller');
const termsCheckbox = document.getElementById('terms');

registerForm.addEventListener('submit', validateForm);

function validateForm(event) {
    let x = nameField.value;
    let y = passwordField.value;
    let z = confirmPasswordField.value;
    let w = emailField.value;
    if (x === "" || w === "" || y === "" || z === "") {
        alert("All fields must be filled out");
        ;
        event.preventDefault();
    }
    else if (y !== z) {
        alert("Passwords do not match");
        event.preventDefault();
    }
    else if (!buyerCheckbox.checked && !sellerCheckbox.checked) {
        alert("Please select at least one user type: Buyer or Seller");
        event.preventDefault();
    } else if (!termsCheckbox.checked) {
        alert("You must agree to the Terms of Use and Privacy Policy");
        event.preventDefault();
    }
}
