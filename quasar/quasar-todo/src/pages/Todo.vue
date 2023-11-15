<template>
  <q-page>
    <h3>{{ title }}</h3>
  </q-page>
</template>

<script lang="ts">
import { Todo, Meta } from 'components/models';
import ExampleComponent from 'components/ExampleComponent.vue';
import { defineComponent, ref } from 'vue';

export default defineComponent({
  name: 'TodoPage',
  components: { ExampleComponent },
  setup () {
    const title = 'Todo';
    return {  title };
  }
});
</script>
