<template>
  <div>

    <v-card-title>Product Room</v-card-title>

    <v-row>
      <v-col class="col-12 pa-6">
        <v-card outlined >
          <v-card-title>베이직 트윈</v-card-title>
          <v-card-subtitle class="red--text">asd asd</v-card-subtitle>
          <v-card-text >
            <div class="d-flex grey lighten-2">
              <div class="d-flex flex-column flex-fill pa-2">
                <strong class="d-flex justify-center">객실공간</strong>
              </div>
              <div class="d-flex flex-column pa-2" style="width: 40%">
                <strong class="d-flex justify-center">서비스 안내</strong>
              </div>
              <div class="d-flex flex-column pa-2" style="width: 15%; ">
                <strong class="d-flex justify-center">최대투숙인원</strong>
              </div>
            </div>
<!--            <v-row class="grey lighten-2">
              <v-col class="col-5 d-flex justify-center">객실공간</v-col>
              <v-col class="col-4 d-flex justify-center">서비스 안내</v-col>
              <v-col class="col-3 d-flex justify-center">최대투숙인원</v-col>
            </v-row>-->

<!--            <v-row>
              <v-col class="col-5 grey lighten-4" >-_-</v-col>
              <v-col class="col-4 d-flex" style="border-right: 1px solid #d4d4d4">
                <div class="d-block">
                  <div>[서비스 구성]</div>
                  <div>[서비스 구성]</div>
                </div>
              </v-col>
              <v-col class="col-3 d-flex justify-center" style="border-right: 1px solid #d4d4d4">성인 2명</v-col>
            </v-row>-->
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "ProductRoom"
}
</script>

<style scoped>

</style>