<template>
  <div>
    <v-navigation-drawer v-model="drawer" app dark right class="secondary">
      <v-list dense>
        <v-list-item link>
          <v-list-item-title @click.stop="drawer = !drawer"><div>Close</div></v-list-item-title>
          <v-btn icon @click.stop="drawer = !drawer">
            <v-icon>mdi-chevron-right</v-icon>
          </v-btn>
        </v-list-item>
        <v-divider light></v-divider>
        <v-list-item link href="/">
          <v-list-item-action>
            <v-icon>mdi-home</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title>Home</v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-email</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <v-list-item-title>Contact</v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-list-item link href="/product">
          <v-list-item-action>
            <v-icon color="#ffb819">mdi-star</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>기획전</v-list-item-title>
          </v-list-item-content>
        </v-list-item>

        <v-list-item link>
          <v-list-item-action>
            <v-icon color="red" dark>mdi-help</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Q&A</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-container class="d-flex justify-space-between pl-1 pr-1">
      <div class="flex d-flex justify-space-between align-items-center" >
        <div><img class="ml-4" :src="logoImgSrc" alt="u-tour" height="30" /></div>
        <v-spacer></v-spacer>
        <div>
          <v-chip close close-icon="mdi-email" dark color="grey" small class="hidden-xs-only">묻고답하기</v-chip>
          <v-chip close close-icon="mdi-help-circle" dark color="grey darken-3" small class="ml-1 mr-2 hidden-xs-only">견적문의</v-chip>
        </div>
      </div>
      <v-menu left bottom right>
        <template v-slot:activator="{ on }">
          <v-app-bar-nav-icon v-on="on"  @click="drawer = !drawer"  />
        </template>
      </v-menu>
    </v-container>

    <div class="secondary">
      <v-container class="pt-0 pb-0">
          <v-tabs grow class="app-bar-tabs" background-color="secondary" dark>
            <v-tabs-slider color="secondary" ></v-tabs-slider>
            <v-tab>하와이</v-tab>
            <v-tab>몰디브</v-tab>
            <v-tab>칸쿤</v-tab>
            <v-tab>유럽</v-tab>
            <v-tab>발리</v-tab>
            <v-tab>태국</v-tab>
            <v-tab>기타</v-tab>
          </v-tabs>
      </v-container>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AppHeader',
  data: function () {
    return {
      drawer: false,
      logoImgSrc : require('@/assets/images/logo_secondary.png')
    }
  }
}
</script>

<style scoped>

</style>
