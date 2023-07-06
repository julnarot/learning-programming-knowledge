// compare two list when with different keyname
const keysNameMapping = {
  id: "ID",
  name: "NAME",
};
/**
 * return boolean value if obj pass if exist in list
 */
function objIsExistInList(obj, list) {
  const propExist = Object.keys(keysNameMapping).map((k) => {
    return [...list.map((m) => m[k])].includes(obj[keysNameMapping[k]]);
  });
  return !propExist.every((e) => e);
}

/**
 * return new list filtered
 */
function compareAndFilterList(listA, listB) {
  return listA.filter((item) => objIsExistInList(item, listB));
}

const resultsItems = [{ ID: 1, NAME: "is diff -> @Julnarot" }];
const details = [
  { id: 1, name: "@Julnarot" },
  { id: 2, name: "Nelly" },
  { id: 3, name: "Joaquien" },
];

console.log(compareAndFilterList(resultsItems, details));
