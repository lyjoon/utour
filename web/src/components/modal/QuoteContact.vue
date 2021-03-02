<template>
  <v-card color="white">
    <v-card-title>가격문의</v-card-title>
    <v-divider />
    <v-card-text>

      <v-sheet elevation="0" tile class="pa-2 mt-2" >
        <v-form class="pa-2">
          <v-row>
            <v-col class="col-5">
              <v-text-field counter maxlength="20" v-model="name" outlined dense placeholder="문의하실분 성함을 작성해주세요." label="이름" />
            </v-col>
            <v-col class="col-7">
              <v-text-field counter maxlength="13" v-model="phoneNumber" outlined dense placeholder="연락받으실 연락처를 작성해주세요" label="연락처" />
            </v-col>
          </v-row>
          <v-row>
            <v-col class="col-12" >
              <v-text-field counter maxlength="100" v-model="phoneNumber" outlined dense placeholder="문의답변을 받으실 E-mail 주소를 작성해주세요" label="E-Mail" />
            </v-col>
          </v-row>
          <v-row>
            <v-col class="col-12" >
              <v-textarea rows="7" v-model="content" no-resize counter maxlength="2000" label="문의내용" outlined dense placeholder="문의하실 내용을 입력해주시기 바랍니다:)"></v-textarea>
            </v-col>
          </v-row>

        </v-form>
      </v-sheet>

    </v-card-text>
    <v-card-action>
      <v-flex class="d-flex pb-4 justify-center">
        <v-btn large dark elevation="0" class="grey mr-1">저장</v-btn>
        <v-btn dark large elevation="0" class="ml-1">닫기</v-btn>
      </v-flex>
    </v-card-action>
  </v-card>
</template>

<script>
export default {
  name: "QuoteContact",
  data: () => ({
    smTab:0,
    phoneNumber: '',
    email:'',
    name:'',
    title:'',
    content:''
  }),
}
</script>

<style scoped>

</style>