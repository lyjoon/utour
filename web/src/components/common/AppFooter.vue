<template>
    <v-footer color="#d4d4d4" absolute inset app>
        <v-container>
            <v-card tile elevation="0" color="transparent">
                <v-card-title class="justify-space-between">
                    <strong>U-TOUR COMPANY</strong>
                    <div>
                      <v-chip small class="grey elevation-0 mr-1" dark v-on:click="dialog.service_terms=!dialog.service_terms">여행약관</v-chip>
                      <v-chip small class="grey elevation-0 mr-1" dark v-on:click="dialog.guaranteed_insurance=!dialog.guaranteed_insurance">보증보험</v-chip>
                      <v-chip small class="grey elevation-0"  dark v-on:click="dialog.privacy_policy=!dialog.privacy_policy">개인정보방침</v-chip>
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
            v-model="dialog.service_terms"
            width="1024">
        <service-terms />
      </v-dialog>
      <v-dialog
          v-model="dialog.privacy_policy"
          width="1024">
        <privacy-policy />
      </v-dialog>
      <v-dialog
          v-model="dialog.guaranteed_insurance"
          width="1024">
        <guaranteed-insurance />
      </v-dialog>

    </v-footer>
</template>

<script>
import ServiceTerms from "@/components/modal/ServiceTerms";
import PrivacyPolicy from "@/components/modal/PrivacyPolicy";
import GuaranteedInsurance from "@/components/modal/GuaranteedInsurance";
export default {
    name: "AppFooter",
  components: {GuaranteedInsurance, PrivacyPolicy, ServiceTerms},
  data: () => ({
    dialog: {
      service_terms: false
    , privacy_policy: false
    , guaranteed_insurance: false
    }
  })
}
</script>

<style scoped>

</style>
