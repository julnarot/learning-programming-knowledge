<template>
  <q-page>
    <h3>{{ title }}</h3>
  </q-page>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'HelpPage',
  setup () {
    const title = 'Help';
    return {  title };
  }
});
</script>
