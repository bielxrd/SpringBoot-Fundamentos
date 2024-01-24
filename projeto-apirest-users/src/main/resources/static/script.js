function cadastrarUsuario() {
    const username = document.getElementById("username").value
    const email = document.getElementById("email").value
    const password = document.getElementById("password").value
    const phone = document.getElementById("phone").value

    const user = {
        username: username,
        email: email,
        password: password,
        phone: phone
    };

    fetch('http://localhost:8080/users/cadastro', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    }).then((response) => {
        response.json().then((users) => {
            window.alert('Usuário cadastrado com sucesso!');
        }).catch(error => {
                window.alert('Erro ao cadastrar usuário. Consulte o console para mais detalhes.');
            })
    })
}