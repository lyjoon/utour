<template>
    <v-app>
        <app-header />
        <router-view />
        <app-footer />
    </v-app>
</template>

<script>
    import AppHeader from "../common/AppHeader";
    import AppFooter from "../common/AppFooter";
    export default {
        name: "AppContainer",
        components: {AppFooter, AppHeader}
    }
</script>

<style scoped>

</style>
