import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>Result 14.0: 🫠</Text>
      <Text style={styles.text}>Result 14.0: 🫱🏼‍🫲🏿</Text>
      <Text style={styles.text}>Result 13.1: 😶‍🌫️</Text>
      <Text style={styles.text}>Result 13.1: 🧔🏻‍♀️</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
  text: {
    textAlign: 'center',
    margin: 16,
    fontSize: 18,
  },
});
