// Configuración de Firebase
const firebaseConfig = {
    apiKey: "AIzaSyAzQaWdFRkF0zTWSHV8vWFcaigLU6E4y2I",
    authDomain: "ficcionarq.firebaseapp.com",
    projectId: "ficcionarq",
};

// Inicializar Firebase
firebase.initializeApp(firebaseConfig);

// Elementos del DOM
const loginForm = document.getElementById('login-form');
const registerForm = document.getElementById('register-form');
const loginError = document.getElementById('login-error');
const registerError = document.getElementById('register-error');
const tabBtns = document.querySelectorAll('.tab-btn');
const formContainers = document.querySelectorAll('.form-container');

// Funcionalidad de pestañas
tabBtns.forEach(btn => {
    btn.addEventListener('click', function() {
        const targetTab = this.getAttribute('data-tab');
        
        // Remover clase active de todos los botones y contenedores
        tabBtns.forEach(b => b.classList.remove('active'));
        formContainers.forEach(c => c.classList.remove('active'));
        
        // Agregar clase active al botón clickeado y su contenedor correspondiente
        this.classList.add('active');
        document.getElementById(`${targetTab}-form-container`).classList.add('active');
        
        // Limpiar mensajes de error
        loginError.textContent = '';
        registerError.textContent = '';
    });
});

// Login con email y contraseña
loginForm.addEventListener('submit', function(event) {
    event.preventDefault();
    const email = document.getElementById('login-email').value;
    const password = document.getElementById('login-password').value;
    loginError.textContent = '';

    firebase.auth().signInWithEmailAndPassword(email, password)
        .then((userCredential) => {
            // Login exitoso
            window.location.href = 'bienvenido.html';
        })
        .catch((error) => {
            loginError.textContent = 'Error: ' + error.message;
        });
});

// Registro con email y contraseña
registerForm.addEventListener('submit', function(event) {
    event.preventDefault();
    const name = document.getElementById('register-name').value;
    const email = document.getElementById('register-email').value;
    const password = document.getElementById('register-password').value;
    const confirmPassword = document.getElementById('register-confirm-password').value;
    registerError.textContent = '';

    // Validar que las contraseñas coincidan
    if (password !== confirmPassword) {
        registerError.textContent = 'Error: Las contraseñas no coinciden';
        return;
    }

    // Validar longitud de contraseña
    if (password.length < 6) {
        registerError.textContent = 'Error: La contraseña debe tener al menos 6 caracteres';
        return;
    }

    firebase.auth().createUserWithEmailAndPassword(email, password)
        .then((userCredential) => {
            // Actualizar el perfil del usuario con el nombre
            return userCredential.user.updateProfile({
                displayName: name
            });
        })
        .then(() => {
            // Registro exitoso
            registerError.textContent = '';
            registerError.classList.add('success-message');
            registerError.textContent = '¡Cuenta creada exitosamente! Redirigiendo...';
            setTimeout(() => {
                window.location.href = 'bienvenido.html';
            }, 2000);
        })
        .catch((error) => {
            registerError.textContent = 'Error: ' + error.message;
        });
});

// Login con Google
const googleLoginBtn = document.getElementById('google-login');
if (googleLoginBtn) {
    googleLoginBtn.addEventListener('click', function() {
        const provider = new firebase.auth.GoogleAuthProvider();
        firebase.auth().signInWithPopup(provider)
            .then((result) => {
                // Login exitoso
                window.location.href = 'bienvenido.html';
            })
            .catch((error) => {
                loginError.textContent = 'Error: ' + error.message;
            });
    });
}

// Registro con Google
const googleRegisterBtn = document.getElementById('google-register');
if (googleRegisterBtn) {
    googleRegisterBtn.addEventListener('click', function() {
        const provider = new firebase.auth.GoogleAuthProvider();
        firebase.auth().signInWithPopup(provider)
            .then((result) => {
                // Registro exitoso
                window.location.href = 'bienvenido.html';
            })
            .catch((error) => {
                registerError.textContent = 'Error: ' + error.message;
            });
    });
} 
