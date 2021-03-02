<template>
  <div>

    <v-card-title>Product Room</v-card-title>

    <v-row>
      <v-col class="col-12 pa-6">
        <v-card outlined >
          <v-card-title>베이직 트윈</v-card-title>
          <v-card-subtitle class="red--text">asd asd</v-card-subtitle>
          <v-card-text class="grey lighten-3 pl-6 pr-6">
            <v-row class="">
                <v-col class="col-6">
                    <strong class="d-flex justify-center">객실/투숙공간</strong>
                </v-col>
                <v-col class="col-3">
                    <strong class="d-flex justify-center">서비스 안내</strong>
                </v-col>
                <v-col class="col-1">
                    <strong class="d-flex justify-center">예약일정</strong>
                </v-col>
                <v-col class="col-2">
                    <strong class="d-flex justify-center">최대투숙인원</strong>
                </v-col>

                <v-col class="col-6" >
                    <v-row>
                        <v-col class="col-12 pt-0 pl-4 pr-2">
                            <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
                        </v-col>
                        <v-col class="col-6 pt-0 pl-4 pr-2 pb-0">
                            <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
                        </v-col>
                        <v-col class="col-6 pt-0 pl-2 pr-2 pb-0">
                            <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
                        </v-col>
                    </v-row>
                </v-col>
                <v-col class="col-3">
                    <v-card color="white" elevation="0" class="fill-height">
                        <v-card-text>
                            <v-list>
                                <v-list-item><v-icon class="green--text mr-2">mdi-check-bold</v-icon> 조식 제공</v-list-item>
                                <v-list-item><v-icon class="green--text mr-2">mdi-check-bold</v-icon> 무료 WI-FI</v-list-item>
                                <v-list-item><v-icon class="green--text mr-2">mdi-check-bold</v-icon> 2021년 3월 1일까지 예약취소 시, 전액무료취소</v-list-item>
                                <v-list-item><v-icon class="green--text mr-2">mdi-check-bold</v-icon> [특가 상품 - 환불불가]</v-list-item>
                            </v-list>
                        </v-card-text>
                    </v-card>
                </v-col>
                <v-col class="col-1" >
                    <v-card color="white" elevation="0" class="fill-height d-flex justify-center">
                        <v-list>
                            <v-btn dense elevation="0" disabled style="border:1px solid #eaeaea"><v-icon>mdi-calendar-month</v-icon></v-btn>
                        </v-list>
                    </v-card>
                </v-col>
                <v-col class="col-2" >
                    <v-card color="white" elevation="0" class="fill-height">
                        <v-list>
                            <v-list-item><v-icon class="mr-2">mdi-account-multiple</v-icon> 성인 2명</v-list-item>
                        </v-list>
                    </v-card>
                </v-col>
            </v-row>
          </v-card-text>
        </v-card>
      </v-col>

      <v-col class="col-12 pa-6">
        <v-card outlined>
          <v-card-title>패밀리</v-card-title>
          <v-card-subtitle class="red--text">asd asd</v-card-subtitle>

          <v-card-text>
            <v-row>
              <v-col class="col-12 pt-0 pl-4 pr-2">
                <v-skeleton-loader type="image,image" height="400" width="100%"></v-skeleton-loader>
              </v-col>
              <v-col class="col-4 pt-0 pl-4 pr-2 pb-0">
                <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
              </v-col>
              <v-col class="col-4 pt-0 pl-2 pr-2 pb-0">
                <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
              </v-col>
              <v-col class="col-4 pt-0 pl-2 pr-2 pb-0">
                <v-skeleton-loader type="image" xs width="100%"></v-skeleton-loader>
              </v-col>
            </v-row>
          </v-card-text>

          <v-card-text>
            <v-card-text>
              <v-icon class="mr-2">mdi-account-multiple</v-icon> 성인 2명
            </v-card-text>
            <div class="ml-2">
              <v-chip small dark color="darken-2"><v-icon small class="mr-1">mdi-check-bold</v-icon> 조식 제공</v-chip>
              <v-chip small dark class="ml-1"><v-icon small class="mr-1">mdi-check-bold</v-icon> 무료 WI-FI</v-chip>
              <v-chip small dark class="ml-1"><v-icon small class="mr-1">mdi-check-bold</v-icon> 2021년 3월 1일까지 예약취소 시, 전액무료취소</v-chip>
              <v-chip small dark class="ml-1"><v-icon small class="mr-1">mdi-check-bold</v-icon> [특가 상품 - 환불불가]</v-chip>
            </div>
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