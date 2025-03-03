<template>
    <div id="div">
        <header><h1>Welcome to Richard's Store</h1></header>
        <main><RouterView></RouterView></main>
        <aside>
            <h3><RouterLink to="/RegisterUser">Register</RouterLink></h3>
            <h3><RouterLink to="/LoginUser">Login</RouterLink></h3>
        </aside>
        <footer>Footer</footer>
    </div>
</template>

<script>
    export default {
        name:'App',
    }
</script>

<style>
    @charset "UTF-8";

    * {
        margin: 0;
        padding: 0;
    }

    body {
        width: 100%;
        min-width: 600px;
        max-width: 960px;
    }
</style>
