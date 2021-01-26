<template>
    <v-content class="d-flex justify-center">

      <home-carousel />

      <v-row class="bgGryDk1">
        <v-container class="mx-auto" grid-list-sm> 
          <v-sheet elevation="1" class="mt-6 mb-12 pa-8">
            <home-subtitle subtitle="추천상품" class="ma-8" />
            <home-deal />
          </v-sheet>

          <v-sheet elevation="1" class="mt-6 mb-12 pa-3">
            <home-subtitle subtitle="여행후기" class="ma-8"/>
            <home-review />
          </v-sheet>

          <v-sheet elevation="1" class="mt-6 mb-6 pa-8">
            <home-contact />
          </v-sheet>
        </v-container>
      </v-row>

    </v-content>
</template>

<script>

    import HomeCarousel from "../components/home/HomeCarousel";
    import HomeSubtitle from "../components/home/HomeSubtitle";
    import HomeContact from "../components/home/HomeContact";
    import HomeDeal from "@/components/home/HomeDeal";
    import HomeReview from "@/components/home/HomeReview";

    export default {
        name: "HomePage",
        components: {HomeReview, HomeDeal, HomeContact, HomeSubtitle, HomeCarousel}
    }
</script>

<style scoped>
    a {text-decoration: none !important;}
    .align-items-center{align-items: center !important;}
    .align-items-end{align-items: end !important;}
    .v-btn {letter-spacing: 0px !important;}
    .v-tab {letter-spacing: 0px !important;}
    .app-bar-tabs-active{color: white !important;font-weight: 600 !important;font-size: 16px !important;}

    .divider_underline {border-top-width:3px; width: 50px;border-collapse: collapse;border-style: solid;margin-top: 10px;margin-bottom: 10px;}
</style>
