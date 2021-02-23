<template>
    <v-footer color="#d4d4d4" absolute inset app>
        <v-container>
            <v-card tile elevation="0" color="transparent">
                <v-card-title class="justify-space-between">
                    <strong>U-TOUR COMPANY</strong>
                    <div>
                      <v-chip small class="grey elevation-0 mr-1" dark v-on:click="dialog=!dialog">여행약관</v-chip>
                      <v-chip small class="grey elevation-0 mr-1" dark>보증보험</v-chip>
                      <v-chip small class="grey elevation-0"  dark>개인정보방침</v-chip>
                    </div>
                </v-card-title>

                <v-card-text>
                    ADDRESS : 서울 강남구 삼성동 지하벙커<br />
                    CHIEF : kei.leeswim <br />
                    TEL : +82(02)-1599-8888 <br />
                    EMAIL : help@u-tour.com
                </v-card-text>
            </v-card>
        </v-container>
      <v-dialog
            v-model="dialog"
            width="1024">
        <service-terms />
      </v-dialog>
    </v-footer>
</template>

<script>
import ServiceTerms from "@/components/modal/ServiceTerms";
export default {
    name: "AppFooter",
  components: {ServiceTerms},
  data: () => ({
    dialog: false
  })
}
</script>

<style scoped>

</style>
