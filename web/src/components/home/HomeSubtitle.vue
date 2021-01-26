<template>
  <v-card tile align="center" elevation="0" color="transparent">
      <v-card-title align="center" class="justify-center display-1">{{subtitle || 'N/A'}}</v-card-title>
      <v-card-subtitle align="center">
          <hr class="divider_underline secondary" />
      </v-card-subtitle>
  </v-card>
</template>

<script>
    export default {
        name: "HomeSubtitle",
        props: ['subtitle'],
        /*
        data () {
            return {
                displayText: ""
            };
        }*/
    }
</script>

<style scoped>

</style>
